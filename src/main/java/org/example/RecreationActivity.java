package org.example;

public class RecreationActivity {
    private String name;

    //optional properties
    private int necessaryTime;
    private String recreationPlace;
    private int recreationPrice;
    private double recreationSpiritRestore;


    //aggregation
    private RecreationName recreationName;

    public RecreationActivity(RecreationName recreationName) {
        this.recreationName = recreationName;
    }




    //encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNecessaryTime() {
        return necessaryTime;
    }

    public void setNecessaryTime(int necessaryTime) {
        this.necessaryTime = necessaryTime;
    }

    public String getRecreationPlace() {
        return recreationPlace;
    }

    public void setRecreationPlace(String recreationPlace) {
        this.recreationPlace = recreationPlace;
    }

    public int getRecreationPrice() {
        return recreationPrice;
    }

    public void setRecreationPrice(int recreationPrice) {
        this.recreationPrice = recreationPrice;
    }

    public double getRecreationSpiritRestore() {
        return recreationSpiritRestore;
    }

    public void setRecreationSpiritRestore(double recreationSpiritRestore) {
        this.recreationSpiritRestore = recreationSpiritRestore;
    }

    public RecreationName getRecreationName() {
        return recreationName;
    }

    public void setRecreationName(RecreationName recreationName) {
        this.recreationName = recreationName;
    }
}
