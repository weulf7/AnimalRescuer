package org.example;

public class DomesticAnimal extends Animal {

    private double price;
    private String whereToPurchase;


    public DomesticAnimal(AnimalType animalType) {
        super(animalType);
    }

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
