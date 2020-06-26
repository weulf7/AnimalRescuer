package anotheranimal;

import org.example.Animal;
import org.example.AnimalType;

public class Cat extends Animal {

    String name = "Tom";



    //constructor overloading
    public Cat(AnimalType animalType) {
        super(animalType);
    }

    @Override
    public void spiritState() {
        super.spiritState();
        setSpiritLevel(6);
        if (getSpiritLevel()>5){
            System.out.println(getName()+" is happy because it's master is carrying about it,the cat is purring. ");

        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
