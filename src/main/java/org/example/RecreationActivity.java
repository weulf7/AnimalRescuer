package org.example;

public class RecreationActivity {
    String name;

    //optional properties
    int necessaryTime;
    String recreationPlace;
    int recreationPrice;
    double recreationSpiritRestore;

    RecreationName recreationName;

    public RecreationActivity(RecreationName recreationName) {
        this.recreationName = recreationName;
    }
}
