package lab3;

abstract class Mercenary {
    protected String name;
    protected String current_class;
    protected int health;
    protected int current_health;
    protected int overheal;
    protected boolean is_dead;
    protected int pos_x;
    protected int pos_y;
    protected int primary_attack;
    protected int max_speed;
    protected String last_victim;

    public Mercenary(String name) {
        System.out.println(name + " has joined the game");
        this.last_victim = "";
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nclass: " + current_class +
                "\ncurrent position (x, y): (" + pos_x + ", " + pos_y +
                ")\ncurrent health: " + current_health;
    }

    public void takeDamage(int damage, String source) {
        if (this.is_dead == false) {
            this.current_health -= damage;
            System.out.println(this.name + " took " + damage + " damage from " + source
                    + ", " + Math.max(0, this.current_health) + " hp remains");
            this.checkDeath(source);
        } else {
            System.out.println(this.name + " is already dead");
        }
    }

    public void takeHealth(int health, String source) {
        this.current_health = Math.min(this.current_health + health, this.health + this.overheal);
        System.out.println(this.name + " received " + health + " health from " +
                source);
    }

    public boolean checkDeath(String cause) {
        if (this.is_dead == true) {
            return true;
        }
        if (this.current_health <= 0) {
            this.current_health = 0;
            this.is_dead = true;
            System.out.println(this.name + " is dead, killer: " + cause);
            return true;
        }
        return false;
    }

    public void move(int x, int y) {
        if (this.is_dead == false) {
            this.pos_x += Math.min(this.max_speed, x);
            this.pos_y += Math.min(this.max_speed, y);
            System.out.println(this.name + " moved to (" + this.pos_x + ", " + this.pos_y + ")");
        } else {
            System.out.println(this.name + " is dead, impossible to move");
        }
    }

    public void attack(Mercenary enemy) {
        enemy.takeDamage(this.primary_attack, this.name);
        if (enemy.is_dead) {
            this.last_victim = enemy.name;
        }
    }
}
