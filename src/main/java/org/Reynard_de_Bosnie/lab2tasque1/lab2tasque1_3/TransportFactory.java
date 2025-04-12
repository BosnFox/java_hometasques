package org.Reynard_de_Bosnie.lab2tasque1.lab2tasque1_3;

import com.sun.jdi.connect.Transport;

public class TransportFactory {
    public TransportFactory() {}
    public ITransport createTransport(String type) {
        switch (type) {
            case "business":
                System.out.println("Here goes a type1");
                return new Business();
            case "family":
                System.out.println("Here goes a type2");
                return new FamilyVan();
            case "fast":
                System.out.println("Here goes a type3");
                return new Delivery();
        }
        System.out.println("Unknown type! Throwing a type2");
        return new FamilyVan();
    }
}
