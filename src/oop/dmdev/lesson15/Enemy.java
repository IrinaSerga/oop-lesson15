package oop.dmdev.lesson15;

public class Enemy implements Mortal {

    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " death");
        } else {
            this.health -= Math.min(health, damage); // чтобы не уйти в отрицат результат. Можно через тернарный
            System.out.println(this.name + " took " + damage + " damage" + " rest: " + health);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }


}
