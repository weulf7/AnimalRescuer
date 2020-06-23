package org.example;

public class Adopter {
    String name;
    double money;

    //Optional properties
    int age;
    String gender;
    String favoriteAnimal;
    int timeToPlayWithTheAnimal;






public void animalRecreation(Animal animal1, Adopter adopter1, RecreationActivity recreation){
    System.out.println(adopter1.name + " is " +recreation.name + " " + animal1.name + ".");

    animal1.spiritLevel += 2;

}


    public int feed(Animal animal1, PetFood petFood, Adopter adopter1) {

        System.out.println( name + " is feeding " + animal1.name + " with" + " " +petFood.name + ".");

        animal1.spiritLevel = animal1.spiritLevel + 2;


        if (petFood.name.equals(animal1.favoriteFood)){
            animal1.spiritLevel+=3;
            System.out.println("Because " +animal1.name +" is eating it's favorite food,it's spirit level has increased by" +animal1.spiritLevel);

        }
        else{
            animal1.spiritLevel +=1;
            System.out.println("Because " +animal1.name +" is eating" +petFood.name + " it's spirit level is restored just with 1point");
        }

        return 0;
    }
    public void entertain(Animal animal1,AnimalActivity activity){
           if (activity.name.equals(animal1.favoriteActivity)){
               animal1.happinessLevel+=2;
               System.out.println(name + " is " +activity.name + " with " +animal1.name +" and because it is the animals favors activity it s happiness level is restored by" +" " +animal1.happinessLevel +".");
           }
            else{
                animal1.happinessLevel+=1;
               System.out.println(name + " is " +activity.name + " with " +animal1.name +" and because it is not the animals favors activity it s happiness level is restored by just" +" " +animal1.happinessLevel +".");

           }
    }
}



