package lab3;

public class Medic extends Mercenary {
    public Medic(String name) {
        super(name);
        this.name = name;
        this.health = 175;
        this.current_health = this.health;
        this.is_dead = false;
        this.pos_x = 0;
        this.pos_y = 0;
        this.primary_attack = 5;
        this.max_speed = 11;
        this.overheal = 50;
    }

    public void heal(Mercenary teammate) {
        teammate.takeHealth(25, this.name);
    }
}
