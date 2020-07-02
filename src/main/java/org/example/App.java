package org.example;

import anotheranimal.Cat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Animal Rescuer!" );

        //Adopter creation

        Adopter adopter1 = new Adopter();

        adopter1.getName() ;
        adopter1.getMoney();
        adopter1.getAge();
        adopter1.getFavoriteAnimal();
        adopter1.getGender();
        adopter1.getTimeToPlayWithTheAnimal();


        //Animal creation
        AnimalType animalType = new AnimalType();
        Animal animal1 = new Animal(animalType);

        animal1.getHealthLevel();
        animal1.getFavoriteFood();
        animal1.getSpiritLevel();
        animal1.getHungerLevel();
        animal1.getFavoritePlaceToSleep();
        animal1.getFavoriteRecreationActivity();
        animal1.getFavoriteToy();
        animal1.getName();
        animal1.getNecessaryTimeToPlayWith();
        animal1.getNecessaryTimeToRest();
        animal1.getHappinessLevel();
        animal1.getFavoriteActivity();


        //Pet food
        NameOfTheFood nameOfTheFood = new NameOfTheFood();

        PetFood petFood = new PetFood(nameOfTheFood);
        petFood.getAmount();
        petFood.setAvailability(true);
        petFood.getEnergyRestore();
        petFood.getName();
        petFood.getFoodType();
        petFood.getHealthRestorePoint();
        petFood.getPrice();
        petFood.getSpiritRestore();

        //RecreationActivity
        RecreationName recreationName = new RecreationName();
        RecreationActivity recreation = new RecreationActivity(recreationName);
        recreation.getName();
        recreation.getNecessaryTime();
        recreation.getRecreationPlace();
        recreation.getRecreationPrice();
        recreation.getRecreationSpiritRestore();

        //Veterinary
        VeterinaryDoctor veterinary = new VeterinaryDoctor();
        veterinary.setAvailability(true);
        veterinary.getName();
        veterinary.getSpecialization();
        veterinary.getTreatmentPrice();
        veterinary.getTreatmentTime();
        veterinary.getTreatmentType();

        adopter1.setName("John");
        animal1.setFavoriteFood("Bone");
        animal1.setName("Mickey");
        petFood.setName("Bone");
        animal1.setHappinessLevel(1);
        animal1.setFavoriteActivity("Walking");
        AnimalActivity animalActivity = new AnimalActivity();
        animalActivity.setName("Walking");
        recreation.setName("peting");




        animal1.setSpiritLevel(1);


        //Animal feeding method
        System.out.println("Total spirit before feeding: " +animal1.getSpiritLevel());
        adopter1.feed(animal1,petFood);
        System.out.println("Total spirit restored after feeding: " + animal1.getSpiritLevel());

        //The animals favorite activity method
        AnimalActivity activity = new AnimalActivity();
        activity.setName("running");
        adopter1.entertain(animal1,activity);

        //Animal recreation activity method
        System.out.println("Total spirit before recreation activity of the dog: " + animal1.getSpiritLevel());
        adopter1.animalRecreation(animal1,adopter1,recreation);
        System.out.println("Total spirit restored after recreation activity: " + animal1.getSpiritLevel());


        animal1.spiritState();
        //Polymorphism
        Animal dog = new Dog(animalType);
        dog.spiritState();
        //Polymorphism
        Animal cat = new Cat(animalType);
        cat.spiritState();









    }
}
