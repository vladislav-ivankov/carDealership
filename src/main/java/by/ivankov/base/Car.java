package by.ivankov.base;


import java.util.List;

public class Car {
    private String equipmentName;
    private Equipment typeEquipment;
    private int numberOfCars;
    private List<Detail> detailsList;
   static final int MIN_SIZE_NAME = 4;
    static final int MAX_SIZE_NAME = 20;
    static final int MAX_COMPONENTS = 8;

    public Car(String equipmentName, Equipment typeEquipment, List<Detail> detailList) {
        setEquipmentName(equipmentName);
        this.typeEquipment = typeEquipment;
        this.detailsList = detailsList;

    }

    public Equipment getTypeEquipment() {
        return typeEquipment;
    }

    public void setTypeEquipment(Equipment typeEquipment) {
        this.typeEquipment = typeEquipment;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public List<Detail> getDetailsList() {
        return detailsList;
    }

    public void setDetailsList(List<Detail> detailsList) {
        this.detailsList = detailsList;
    }

    public String getName(){
        return equipmentName;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void addDetail(Detail detail){
        if (detailsList.size() > MAX_COMPONENTS) {
            System.out.println("This car is already assembled.");
        }
        if(detailsList.contains(detail)) {
            System.out.println("The details are repeated. Check the order again.");
        }else {
            detailsList.add(detail);;
        }
    }
    public String getEquipmentName(){
        return equipmentName;
    }
    public void setEquipmentName(String equipmentName) {
        if (MIN_SIZE_NAME <= equipmentName.length() && equipmentName.length() <= MAX_SIZE_NAME){
            this.equipmentName = equipmentName;
        }else{
            this.equipmentName = "888";// FIXME: 23.12.2022
        }
    }
}
