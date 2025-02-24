package oop.dmdev.hometask;

public class Satellite  extends SpaceObject{

private final Planet planet; // кому принадлежишь
private final boolean isNatural; // свойство только для спутников

    public Satellite(SpaceObjectList satellite, Planet planet, boolean isNatural) {
        super(satellite.getName(), satellite.getWeight());
        this.planet = planet;
        this.isNatural = isNatural;
    }

    public Planet getPlanet() {
        return planet;
    }


    @Override
    public String getInformation() {
        return super.getInformation() + ", Естественный спутник: " + isNatural + "Какой планеты? " + getPlanet();
    }
}
