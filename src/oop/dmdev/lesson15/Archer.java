package oop.dmdev.lesson15;

public class Archer extends Hero{

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стельнул из лука b "  + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
