package oop.dmdev.hometask;

public class Planet extends SpaceObject{
    private final boolean isHasAtmosphere; // только для планет есть такон свойство

    public Planet(SpaceObjectList planet, boolean hasAtmosphere) {
        super(planet.getName(), planet.getWeight());
        this.isHasAtmosphere = hasAtmosphere;
    }

    public boolean isHasAtmosphere() {
        return isHasAtmosphere;
    }


    @Override
    public String getInformation() {
        // Возвращаем строку с информацией о планете
         return super.getInformation() +  ", Атмосфера: " + isHasAtmosphere();
    }
}
