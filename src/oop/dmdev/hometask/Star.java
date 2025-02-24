package oop.dmdev.hometask;

public class Star  extends SpaceObject{
private final double luminosity;

    public Star(SpaceObjectList star, double luminosity) {
        super(star.getName(), star.getWeight());
        this.luminosity = luminosity;
    }


    @Override
    public String getInformation() {
        return super.getInformation() + ", Светимость: " + luminosity;
    }
}
