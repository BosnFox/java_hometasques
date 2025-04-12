package org.Reynard_de_Bosnie.tasque16;

public enum Rank {
    PIKI("piki"),
    CZERWI("czerwi"),
    BUBNY("bubny"),
    TREFY("trefy");

    private String type;

    Rank(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
