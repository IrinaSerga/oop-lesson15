package oop.dmdev.hometask;

import static oop.dmdev.hometask.SpaceObjectList.*; // импорт класса, чтоб не писать его каждый раз
import static oop.dmdev.hometask.SpaceUtils.*; // импорт класса, чтоб не писать его каждый раз

public class SpaceRunner {
    public static void main(String[] args) {


        Star sun = new Star(SUN, 3.828e26);
        Planet jupiter = new Planet(JUPITER, true);
        Asteroid asteroid = new Asteroid(ASTEROID_X, "2");
        Planet earth = new Planet(EARTH, true);
        Satellite moon = new Satellite(MOON, earth,true);

        System.out.println(sun.getInformation());
        System.out.println(jupiter.getInformation());
        System.out.println(asteroid.getInformation());
        System.out.println(earth.getInformation());
        System.out.println(moon.getInformation());

        double gravity = calcGravity(sun, earth);
        System.out.println("Гравитационная сила между " + SUN.getName() + " и " + EARTH.getName() + " = " + gravity);


        boolean isStar = isStar(sun);
        System.out.println(isStar);

    }
}
