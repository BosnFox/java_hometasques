package lab3;

public class Medic extends Mercenary implements ITaunt {
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
        if (teammate.is_dead == false) {
            teammate.takeHealth(25, this.name);
        } else {
            System.out.println(teammate.name + " respawns at (0, 0), reason: " + this.name);
            teammate.is_dead = false;
            teammate.current_health = teammate.health;
        }
    }

    @Override
    public void Taunt() {
        if (this.is_dead == false) {
            {
                System.out.println(this.name + " goes \"Oops, that was not " +
                        "medicine\" on " + ((this.last_victim.equals("")) ? "someone" : this.last_victim));
                this.last_victim = "";
            }
        }
    }
}
