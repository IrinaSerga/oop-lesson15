package oop.dmdev.lesson15;

import static oop.dmdev.lesson15.Archer.*;

public class TrainingGround {



    public static void main(String[] args) {
        Hero warrior = new Warrior("Boromir", 15);
        Hero mage = new Mage("Gendolph", 20);
        Archer archer = new Archer("Legolaz", 10);
        Wolf wolf = new Wolf("Second wolf", 1);

        Enemy enemy = new Enemy(100, "Zombie");
        attackEnemy(enemy, warrior, mage, archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }

    }
}

