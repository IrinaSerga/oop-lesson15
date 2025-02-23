package oop.dmdev.hometask;

public class Asteroid extends SpaceObject{
    private final String orbitalPath; // Уникальное свойство для астероида

    public Asteroid(SpaceObjectList asteroid, String orbitalPath) {
        super(asteroid.getName(), asteroid.getWeight());
        this.orbitalPath = orbitalPath;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + ", Орбитальный путь: " + orbitalPath;
    }
}
