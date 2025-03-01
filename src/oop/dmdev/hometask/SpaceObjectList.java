package oop.dmdev.hometask;

/**
 * Добавила енум, не уверена что он нужен в данном случае
 */
public enum SpaceObjectList {
    //Масса (1024 кг)
    SUN("Солнце", 1.989e30), // звезда
    EARTH("Земля", 5.972e24), // планета
    MOON("Луна", 7.347e22), //спутник
    MARS("Марс", 6.417e23), //планета
    JUPITER("Юпитер", 1.898e27), // планета
    ASTEROID_X("Астероид X", 1.2e12); // астероид

    private final String name;
    private final double weight;

    SpaceObjectList(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


}
