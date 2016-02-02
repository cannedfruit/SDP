package Day05.builder;

public class SedanCarBuilder implements CarBuilder {

    private
    Car sedan;

    public SedanCarBuilder(){
        sedan = new Car("SEDAN");
    }

    @Override
    public void buildBodyStyle() {
        sedan.setBodyStyle("External dimensions: overall length (inches): 202.9,\n" +
                "\toverall width (inches): 76.2, overall height (inches): 60.7,\n" +
                "\twheelbase (inches): 112.9, front track (inches): 65.3,\n" +
                "\trear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }

    @Override
    public void buildPower() {
        sedan.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }

    @Override
    public void buildEngine() {
        sedan.setEngine("3.5L Duramax V 6 DOHC");
    }

    @Override
    public void buildBreaks() {
        sedan.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
    }

    @Override
    public void buildSeats() {
        sedan.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
    }

    @Override
    public void buildWindows() {
        sedan.setWindows("Laminated side windows.Fixed rear window with defroster");
    }

    @Override
    public void buildFuelType() {
        sedan.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }

    @Override
    public Car getCar() {
        return sedan;
    }
}
