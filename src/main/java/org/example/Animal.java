package org.example;

public class Animal  {
    String name;
    int healthLevel;
    int hungerLevel;
    int spiritLevel;
    String favoriteFood;
    String favoriteRecreationActivity;
    String favoriteActivity;
    int happinessLevel;


    //optional properties
    String favoritePlaceToSleep;
    String favoriteToy;
    double necessaryTimeToPlayWith;
    double necessaryTimeToRest;

AnimalType animalType;

    public Animal(AnimalType animalType) {
        this.animalType = animalType;
    }

}
