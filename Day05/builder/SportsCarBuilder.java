package Day05.builder;

public class SportsCarBuilder implements CarBuilder {

    private Car sportsCar;

    public SportsCarBuilder(){
        sportsCar = new Car("SPORTS");
    }

    @Override
    public void buildBodyStyle() {
        sportsCar.setBodyStyle("External dimensions: overall length (inches): 192.3,\n" +
                "\toverall width (inches): 75.5, overall height (inches): 54.2,\n" +
                "\twheelbase (inches): 112.3, front track (inches): 63.7,\n" +
                "\trear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
    }

    @Override
    public void buildPower() {
        sportsCar.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");
    }

    @Override
    public void buildEngine() {
        sportsCar.setEngine(" 3.6L V 6 DOHC and variable valve timing");
    }

    @Override
    public void buildBreaks() {
        sportsCar.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution.\n" +
                "\tStability control");
    }

    @Override
    public void buildSeats() {
        sportsCar.setSeats("Driver sports front seat with one power adjustments manual height,\n" +
                "\tfront passenger seat sports front seat with one power adjustments");
    }

    @Override
    public void buildWindows() {
        sportsCar.setWindows("Front windows with one-touch on two windows");
    }

    @Override
    public void buildFuelType() {
        sportsCar.setFuelType(" Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range");
    }

    @Override
    public Car getCar() {
        return sportsCar;
    }
}
