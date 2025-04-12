package org.Reynard_de_Bosnie.tasque17;

public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User(null, "TresTresLoinNomme", 101);

        Validator.validate(user);
    }
}
