package oop.dmdev.hometask;

/**
 * Создать утилитный класс* SpaceUtils со следующими статическими методами:
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними (можно придумать любую формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет
 * Утилитный класс* - это такой класс, который:
 * - помечен ключевым словом final, чтобы запретить наследоваться от него
 * - имеет private конструктор, чтобы нельзя было создать объект этого класса
 * - имеет только статические методы и константы
 */
final class SpaceUtils { //помечен ключевым словом final, чтобы запретить наследоваться от него

    private SpaceUtils() {
    } // чтобы нельзя біло создать єкземляр класса

    //Принимающий 2 космический объекта и определяющий силу гравитации между ними
    public static double calcGravity(SpaceObject object1, SpaceObject object2) {

        double weight1 = object1.getWeight();
        double weight2 = object2.getWeight();
        double distance = object1.getDistanceBetween(object2);

        //"Моя" формула гравитации, далекая от реальности: F = (m1 * m2) / r³
        return (weight1 * weight2) / Math.pow(distance, 3); // Math.pow(distance, 3) возводит число distance в куб
    }

    // Принимающий космический объект и определяющий, является ли он звездой или нет
    public static boolean isStar(SpaceObject object) {
        return object instanceof Star; // являешься ли ты объектом класса Звезда?
    }
}
