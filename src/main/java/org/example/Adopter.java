package org.example;

public class Adopter {
    String name;
    double money;

    //Optional properties
    int age;
    String gender;
    String favoriteAnimal;
    int timeToPlayWithTheAnimal;




public void feed(Animal animal1,PetFood petFood,Adopter adopter1){
    System.out.println( adopter1.name + " is feeding " + animal1.name + " with" + " " +petFood.name + ".");

    animal1.spiritLevel = animal1.spiritLevel + 8;

}

public void animalRecreation(Animal animal1, Adopter adopter1, RecreationActivity recreation){
    System.out.println(adopter1.name + " is " +recreation.name + " " + animal1.name + ".");

    animal1.spiritLevel = animal1.spiritLevel +4;
}





    }



