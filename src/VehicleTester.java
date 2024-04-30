public class VehicleTester {
    public static void main(String[] args) {
        Vehicle v;
        v=new Vehicle();
        v.setMake("Ford");
        v.setMilesPerGallon(35);

        System.out.println("My "+v.getMake()  +  " gets " + v.getMilesPerGallon() + " mpg.");
    }

}
