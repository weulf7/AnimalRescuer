package org.example;

public class Adopter {
   private String name;
   private double money;

   //Optional properties
   private int age;
   private String gender;
   private String favoriteAnimal;
   private int timeToPlayWithTheAnimal;






public void animalRecreation(Animal animal1, Adopter adopter1, RecreationActivity recreation){
    System.out.println(adopter1.name + " is " +recreation.getName() + " " + animal1.getName() + ".");

    animal1.setSpiritLevel(animal1.getSpiritLevel()+2);

}


    public int feed(Animal animal1, PetFood petFood, Adopter adopter1) {

        System.out.println( name + " is feeding " + animal1.getName() + " with" + " " +petFood.getName() + ".");

        animal1.setSpiritLevel(animal1.getSpiritLevel()+2);


        if (petFood.getName().equals(animal1.getFavoriteFood())){
            animal1.setSpiritLevel(animal1.getSpiritLevel()+3);
            System.out.println("Because " +animal1.getName() +" is eating it's favorite food,it's spirit level has increased by" +animal1.getSpiritLevel());

        }
        else{
            animal1.setSpiritLevel(animal1.getSpiritLevel()+1);
            System.out.println("Because " +animal1.getName() +" is eating" +petFood.getName() + " it's spirit level is restored just with 1point");
        }

        return 0;
    }
    public void entertain(Animal animal1,AnimalActivity activity){
           if (activity.getName().equals(animal1.getFavoriteActivity())){
               animal1.setHappinessLevel(animal1.getHappinessLevel()+2);
               System.out.println(name + " is " +activity.getName() + " with " +animal1.getName() +" and because it is the animals favors activity it s happiness level is restored by" +" " +animal1.getHappinessLevel() +".");
           }
            else{
                animal1.setHappinessLevel(animal1.getHappinessLevel()+1);
               System.out.println(name + " is " +activity.getName() + " with " +animal1.getName() +" and because it is not the animals favors activity it s happiness level is restored by just" +" " +animal1.getHappinessLevel() +".");

           }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public int getTimeToPlayWithTheAnimal() {
        return timeToPlayWithTheAnimal;
    }

    public void setTimeToPlayWithTheAnimal(int timeToPlayWithTheAnimal) {
        this.timeToPlayWithTheAnimal = timeToPlayWithTheAnimal;
    }
}



