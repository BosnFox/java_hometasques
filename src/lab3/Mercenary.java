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

    public Mercenary(String name) {
        System.out.println(name + " has joined the game");
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nclass: " + current_class +
                "\ncurrent position (x, y): (" + pos_x + ", " + pos_y +
                ")\ncurrent health: " + current_health;
    }

    public void takeDamage(int damage, String source) {
        this.current_health -= damage;
        System.out.println(this.name + " took " + damage + " damage from " + source);
        this.checkDeath();
    }

    public void takeHealth(int health, String source) {
        this.current_health = Math.min(this.current_health + health, this.health + this.overheal);
        System.out.println(this.name + " received " + health + " health from " + source);
    }

    public void checkDeath() {
        if (this.current_health <= 0) {
            this.current_health = 0;
            this.is_dead = true;
        }
    }

    public void move(int x, int y) {
        this.pos_x += Math.min(this.max_speed, x);
        this.pos_y += Math.min(this.max_speed, y);
    }

    public void attack(Mercenary enemy) {
        enemy.takeDamage(this.primary_attack, this.name);
    }
}
