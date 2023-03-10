package by.ivankov.task2.entity;


import by.ivankov.task2.util.IdGenerator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Car {
    static Logger logger = LogManager.getLogger();
    private static final int MIN_SIZE_NAME = 4;
    private static final int MAX_SIZE_NAME = 20;
    public static final int MAX_COMPONENTS = 6;
    private String name;
    private Equipment typeEquipment;
    private List<Detail> detailsList = new ArrayList<>();


    public Car(String name, Equipment typeEquipment) {
        setName(name);
        this.typeEquipment = typeEquipment;
    }

    public void setName(String name) {
        if (MIN_SIZE_NAME <= name.length() && name.length() <= MAX_SIZE_NAME) {
            this.name = name;
        } else {
            this.name = ("client №" + IdGenerator.orderIdGenerator());
        }
    }

    public String getName() {
        return name;
    }

    public Equipment getTypeEquipment() {
        return typeEquipment;
    }

    public List<Detail> getDetailsList() {
        return detailsList;
    }

    public boolean addDetail(Detail detail) {
        boolean mach = false;
        if (detailsList.size() >= MAX_COMPONENTS || detailsList.contains(detail)) {
            logger.log(Level.ERROR, "The machine is assembled or has the same parts. Check the order!");
        }else {
            detailsList.add(detail);
            logger.log(Level.INFO, "The item was successfully added.");
            mach = true;
        }
        return mach;
    }
}
