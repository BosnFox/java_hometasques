package org.src.tasque16;

import javax.print.attribute.PrintJobAttribute;

public enum Suit {
    TUZ("tuz"),
    KOROL("korol"),
    DAMA("dama"),
    WALET("walet"),
    DESIAT("desiat"),
    DEWIAT("dewiat"),
    WOSIEM("wosiem"),
    SIEM("siem"),
    SIEST("siest"),
    PIAT("piat"),
    CIETYRIE("cietyrie"),
    TRI("tri"),
    DWA("dwa");
    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
