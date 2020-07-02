package org.example;

public class Animal  {
    private String name;
    private int healthLevel;
    private int hungerLevel;
    private int spiritLevel;
    private String favoriteFood;
    private String favoriteRecreationActivity;
    private String favoriteActivity;
    private int happinessLevel;


    //optional properties
    private String favoritePlaceToSleep;
    private String favoriteToy;
    private double necessaryTimeToPlayWith;
    private double necessaryTimeToRest;


    //aggregation
    private AnimalType animalType;

    public Animal(AnimalType animalType) {
        this.animalType = animalType;
    }

    //overriding methods

    public void spiritState(){
        if (getSpiritLevel()>5){
            System.out.println(getName()+" is happy because it's master is carrying about it");

        }

    }









    //encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationActivity() {
        return favoriteRecreationActivity;
    }

    public void setFavoriteRecreationActivity(String favoriteRecreationActivity) {
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavoritePlaceToSleep() {
        return favoritePlaceToSleep;
    }

    public void setFavoritePlaceToSleep(String favoritePlaceToSleep) {
        this.favoritePlaceToSleep = favoritePlaceToSleep;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public double getNecessaryTimeToPlayWith() {
        return necessaryTimeToPlayWith;
    }

    public void setNecessaryTimeToPlayWith(double necessaryTimeToPlayWith) {
        this.necessaryTimeToPlayWith = necessaryTimeToPlayWith;
    }

    public double getNecessaryTimeToRest() {
        return necessaryTimeToRest;
    }

    public void setNecessaryTimeToRest(double necessaryTimeToRest) {
        this.necessaryTimeToRest = necessaryTimeToRest;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
