package org.example;

public class DomesticAnimal extends Animal {

    private double price;
    private String whereToPurchase;

    //aggregation
    public DomesticAnimal(AnimalType animalType) {
        super(animalType);
    }



    //encapsulation

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWhereToPurchase() {
        return whereToPurchase;
    }

    public void setWhereToPurchase(String whereToPurchase) {
        this.whereToPurchase = whereToPurchase;
    }
}
