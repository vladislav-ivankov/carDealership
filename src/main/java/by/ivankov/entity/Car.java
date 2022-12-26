package by.ivankov.entity;


import java.util.List;
public class Car {
    private String equipmentName;
    private Equipment typeEquipment;
    private List<Detail> detailsList;
   static final int MIN_SIZE_NAME = 4;
    static final int MAX_SIZE_NAME = 20;
    static final int MAX_COMPONENTS = 8;

    public Car(String equipmentName, Equipment typeEquipment,List<Detail> detailList) {
        this.equipmentName = equipmentName;
        this.typeEquipment = typeEquipment;
        this.detailsList = detailList;

    }

    public Equipment getTypeEquipment() {
        return typeEquipment;
    }

    public List<Detail> getDetailsList() {
        return detailsList;
    }

    public void addDetail(Detail detail){
        if (detailsList.size() > MAX_COMPONENTS) {
            System.out.println("This car is already assembled.");
        }
        if(detailsList.contains(detail)) {
            System.out.println("The details are repeated. Check the order again.");
        }else {
            detailsList.add(detail);
        }
    }

    public int orderTotalPrice(){
        int totalPrice = 0;
        for(Detail detail : detailsList){
            totalPrice += detail.getPrice();
        }
        return totalPrice + typeEquipment.getPrice();
    }

    public String getEquipmentName(){
        return equipmentName;
    }
}
