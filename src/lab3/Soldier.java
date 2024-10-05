package lab3;

public class Soldier extends Mercenary implements ITaunt {
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
        this.current_class = "soldier";
    }

    @Override
    public void Taunt() {
        if (this.is_dead == false) {
            {
                System.out.println(this.name + "goes \"You will not be missed\"" +
                        " on " + ((this.last_victim.equals("")) ? "someone" : this.last_victim));
                this.last_victim = "";
            }
        }
    }
}
