package org.example;

import java.util.Date;

public class PetFood  {
    private String name;
    private double price;
    private double amount;
    private int expiration;
    private boolean availability;

    //optional properties
    private int healthRestorePoint;
    private int energyRestore;
    private int spiritRestore;
    private String foodType;


    //aggregation
    private NameOfTheFood nameOfTheFood;

    public PetFood(NameOfTheFood nameOfTheFood) {
        this.nameOfTheFood = nameOfTheFood;
    }




    //encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getHealthRestorePoint() {
        return healthRestorePoint;
    }

    public void setHealthRestorePoint(int healthRestorePoint) {
        this.healthRestorePoint = healthRestorePoint;
    }

    public int getEnergyRestore() {
        return energyRestore;
    }

    public void setEnergyRestore(int energyRestore) {
        this.energyRestore = energyRestore;
    }

    public int getSpiritRestore() {
        return spiritRestore;
    }

    public void setSpiritRestore(int spiritRestore) {
        this.spiritRestore = spiritRestore;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public NameOfTheFood getNameOfTheFood() {
        return nameOfTheFood;
    }

    public void setNameOfTheFood(NameOfTheFood nameOfTheFood) {
        this.nameOfTheFood = nameOfTheFood;
    }
}
