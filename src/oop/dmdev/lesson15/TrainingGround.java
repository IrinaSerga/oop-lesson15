package oop.dmdev.lesson15;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Boromir", 15);
        Hero mage = new Mage("Gendolph", 20);
        Hero archer = new Archer("Legolaz", 10);


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

