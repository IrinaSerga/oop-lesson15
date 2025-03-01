package oop.dmdev.hometask;

public class Planet extends SpaceObject{
    private final boolean isHasAtmosphere; // только для планет есть такон свойство


    /**
     * ну раз у тебя есть у спутника планета, то можнои в планету запихнуть массив спутников))

     */
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
