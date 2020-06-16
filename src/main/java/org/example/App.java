package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Animal Rescuer!" );

        //Adopter

        Adopter adopter1 = new Adopter();



        adopter1.name = "John";
        adopter1.money = 200;
        adopter1.age = 20;
        adopter1.favoriteAnimal ="Dog";
        adopter1.gender= "male";
        adopter1.timeToPlayWithTheAnimal= 2;

//        System.out.println(adopter1.name);
//        System.out.println(adopter1.money);
//        System.out.println(adopter1.age);
//        System.out.println(adopter1.favoriteAnimal);
//        System.out.println(adopter1.gender);
//        System.out.println(adopter1.timeToPlayWithTheAnimal);

        //Animal
        Animal animal1 = new Animal();

        animal1.healthLevel = 10;
        animal1.favoriteFood = "Bone";
        animal1.spiritLevel = 1;
        animal1.hungerLevel = 1 ;
        animal1.favoritePlaceToSleep = "Couch";
        animal1.favoriteRecreationActivity = "Laying in the couch";
        animal1.favoriteToy = "Ball";
        animal1.name = "Mickey";
        animal1.necessaryTimeToPlayWith = 1;
        animal1.necessaryTimeToRest = 8;






//        System.out.println(animal1.healthLevel);
//        System.out.println(animal1.favoriteFood);
//        System.out.println(animal1.spiritLevel);
//        System.out.println(animal1.hungerLevel);
//        System.out.println(animal1.favoritePlaceToSleep);
//        System.out.println(animal1.favoriteRecreationActivity);
//        System.out.println(animal1.favoriteToy);
//        System.out.println(animal1.name);
//        System.out.println(animal1.necessaryTimeToPlayWith);
//        System.out.println(animal1.necessaryTimeToRest);

        //Pet food

        PetFood petFood = new PetFood();
        petFood.amount = 5  ;
        petFood.availability = true;
        petFood.energyRestore = 4;

        petFood.foodType ="dog food";
        petFood.healthRestorePoint = 4;
        petFood.name ="Pedigree";
        petFood.price = 10;
        petFood.spiritRestore = 3;



        System.out.println("Total spirit before feedign: " +animal1.spiritLevel);
        adopter1.feed(animal1,petFood,adopter1);
        System.out.println("Total spirit restored after feeding: " + animal1.spiritLevel);


//        System.out.println(petfood1.amount);
//        System.out.println(petfood1.availability);
//        System.out.println(petfood1.energyRestore);
//        System.out.println(petfood1.expiration);
//        System.out.println(petfood1.foodType);
//        System.out.println(petfood1.healthRestorePoint);
//        System.out.println(petfood1.name);
//        System.out.println(petfood1.price);
//        System.out.println(petfood1.spiritRestore);


        //RecreationActivity
        RecreationActivity recreation = new RecreationActivity();
        recreation.name = "Laying";
        recreation.necessaryTime = 2;
        recreation.recreationPlace ="House";
        recreation.recreationPrice = 20;
        recreation.recreationSpiritRestore = 6;

//        System.out.println(recreation.name);
//        System.out.println(recreation.necessaryTime);
//        System.out.println(recreation.recreationPlace);
//        System.out.println(recreation.recreationPrice);
//        System.out.println(recreation.recreationSpiritRestore);

        //VeterinaryDoctor

        VeterinaryDoctor veterinary = new VeterinaryDoctor();
        veterinary.availability = true;
        veterinary.name ="Dr.Joseph";
        veterinary.specialization ="Dermotology";
        veterinary.treatmentPrice = 80;
        veterinary.treatmentTime = 2;
        veterinary.treatmentType = "Anesthesia";
//
//        System.out.println(veterinary.availability);
//        System.out.println(veterinary.name);
//        System.out.println(veterinary.specialization);
//        System.out.println(veterinary.treatmentPrice);
//        System.out.println(veterinary.treatmentTime);
//        System.out.println(veterinary.treatmentType);

    }
}
