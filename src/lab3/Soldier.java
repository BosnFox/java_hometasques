package lab3;

public class Soldier extends Mercenary{
    public Soldier(String name) {
        super(name);
        this.name = name;
        this.health = 200;
        this.current_health = this.health;
        this.is_dead = false;
        this.pos_x = 0;
        this.pos_y = 0;
        this.primary_attack = 50;
        this.max_speed = 8;
        this.overheal = 100;
    }
}
