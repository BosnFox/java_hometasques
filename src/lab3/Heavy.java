package lab3;

public class Heavy extends Mercenary implements ITaunt {
    public Heavy(String name) {
        super(name);
        this.name = name;
        this.health = 300;
        this.current_health = this.health;
        this.is_dead = false;
        this.pos_x = 0;
        this.pos_y = 0;
        this.primary_attack = 25;
        this.max_speed = 5;
        this.overheal = 150;
        this.current_class = "soldier";
    }

    @Override
    public void Taunt() {
        if (this.is_dead == false) {
            {
                System.out.println(this.name + " goes \"You are dead -- not big surprise\"" +
                        " on " + ((this.last_victim.equals("")) ? "someone" : this.last_victim));
                this.last_victim = "";
            }
        }
    }
}
