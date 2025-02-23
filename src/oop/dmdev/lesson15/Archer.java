package oop.dmdev.lesson15;

public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        class Test { // возможно создание класса внутри метода
        }

        Test test = new Test();
        System.out.println(getName() + " стельнул из лука b " + enemy.getName());
        wolf.attackEnemy(enemy);
    }


    public static class Wolf { // внутренние/вложенные классы; без статика, иначе утрачиваем возможность ссылаться на первый класс

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }


        public void attackEnemy(Enemy enemy) {
          //  System.out.println(name + " and " + Archer.this.getName() + " combo");
          //  enemy.takeDamage(damage + Archer.this.getDamage());

        }
    }
}
