package org.example;

public class Dog extends DomesticAnimal {

    private String dogSize;
    private int lifeSpan;
    String name = "Mickey";



    //aggregation
    private DogBreed dogBreed;

    public Dog(AnimalType animalType) {
        super(animalType);
    }


    //method overriding

    @Override
    public void spiritState() {
        super.spiritState();
        setSpiritLevel(6);
        if (getSpiritLevel()>5){
            System.out.println(getName()+" is happy because it's master is carrying about it,the dog is wagging it's tail.");

        }
    }


    //encapsulation

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public String getDogSize() {
        return dogSize;
    }

    public void setDogSize(String dogSize) {
        this.dogSize = dogSize;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public DogBreed getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(DogBreed dogBreed) {
        this.dogBreed = dogBreed;
    }
}
