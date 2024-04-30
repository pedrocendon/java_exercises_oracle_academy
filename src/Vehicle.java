public class Vehicle {

    private String make;
    private int milesPerGallon;

    public Vehicle() {

    }

    public void setMake(String m) {
        make = m;
    }

    public void setMilesPerGallon(int mpg) {
        milesPerGallon = mpg;
    }

    public String getMake() {
        return make;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }
}
