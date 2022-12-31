package by.ivankov.task2.entity;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Car {
    public final int MAX_COMPONENTS = 8;
    private String name;
    private Equipment typeEquipment;
    private List<Detail> detailsList;
    static Logger logger = LogManager.getLogger();

    public Car(String name, Equipment typeEquipment, List<Detail> detailsList) {
        this.name = name;
        this.typeEquipment = typeEquipment;
        this.detailsList = detailsList;

    }

    public Equipment getTypeEquipment() {
        return typeEquipment;
    }

    public String getName() {
        return name;
    }

    public List<Detail> getDetailsList() {
        return detailsList;
    }

    public void addDetail(Detail detail) {
        if (detailsList.size() > MAX_COMPONENTS) {
            logger.log(Level.INFO, "!This car is already assembled.!");
        }
        if (detailsList.contains(detail)) {
            logger.log(Level.INFO, "!The details are repeated. Check the order again.!");
        } else {
            detailsList.add(detail);
        }
    }
}
