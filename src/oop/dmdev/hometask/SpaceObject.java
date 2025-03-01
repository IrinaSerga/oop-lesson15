package oop.dmdev.hometask;

public abstract class SpaceObject implements Describable { // наследуемся от него, содержит общие характеристики для всех космических тел

    final String name;
    private final double weight;
    private double distance;

    //distance это дистанция от чего? по факту это поле ут не надо, так как эта характеристика чисто субъективная

    // конструктор класса
    public SpaceObject(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
//Создать общие методы:
//- Рассчитывающие диаметр космического объекта

    public double calculateDiameter(double weight, double density) {
        double volume = weight / density;
        return 2 * Math.cbrt((3 * volume) / (4 * Math.PI)); // гуглила, вообще не сильна в космосе. Не уверена что єто верная формула
    }

    // Базовый метод для получения информации об объекте
    @Override
    public String getInformation() {
        return name + " (Тип: " + this.getClass().getSimpleName() + "), масса: " + weight ;
    }

    // для утилитного класса
    public double getDistanceBetween(SpaceObject otherObject) {
        return Math.abs(this.distance - otherObject.distance);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


}
