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

        //Adopter creation

        Adopter adopter1 = new Adopter();

        adopter1.name = "John";
        adopter1.money = 200;
        adopter1.age = 20;
        adopter1.favoriteAnimal ="Dog";
        adopter1.gender= "male";
        adopter1.timeToPlayWithTheAnimal= 2;


        //Animal creation
        AnimalType animalType = new AnimalType();
        Animal animal1 = new Animal(animalType);

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
        animal1.happinessLevel=1;
        animal1.favoriteActivity="Walking";


        //Pet food
        NameOfTheFood nameOfTheFood = new NameOfTheFood();

        PetFood petFood = new PetFood(nameOfTheFood);
        petFood.amount = 5  ;
        petFood.availability = true;
        petFood.energyRestore = 4;
        petFood.name="Milk";
        petFood.foodType ="dog food";
        petFood.healthRestorePoint = 4;
        petFood.price = 10;
        petFood.spiritRestore = 3;







        //RecreationActivity
        RecreationName recreationName = new RecreationName();
        RecreationActivity recreation = new RecreationActivity(recreationName);
        recreation.name = "Caressing";
        recreation.necessaryTime = 2;
        recreation.recreationPlace ="House";
        recreation.recreationPrice = 20;
        recreation.recreationSpiritRestore = 6;

        //
//        VeterinaryDoctor veterinary = new VeterinaryDoctor();
//        veterinary.availability = true;
//        veterinary.name ="Dr.Joseph";
//        veterinary.specialization ="Dermotology";
//        veterinary.treatmentPrice = 80;
//        veterinary.treatmentTime = 2;
//        veterinary.treatmentType = "Anesthesia";





        //Animal feeding
        System.out.println("Total spirit before feeding: " +animal1.spiritLevel);
        adopter1.feed(animal1,petFood,adopter1);
        System.out.println("Total spirit restored after feeding: " + animal1.spiritLevel);

        //The animals favorite activity
        AnimalActivity activity = new AnimalActivity();
        activity.name="Walking";
        adopter1.entertain(animal1,activity);


        //Animal recreation activity
        System.out.println("Total spirit before recreation activity of the dog: " + animal1.spiritLevel);
        adopter1.animalRecreation(animal1,adopter1,recreation);
        System.out.println("Total spirit restored after recreation activity: " + animal1.spiritLevel);










    }
}
