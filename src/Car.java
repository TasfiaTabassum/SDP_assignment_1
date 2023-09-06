public abstract class Car {
    Engine engine;
    Tire tire;
    Chassis chassis;
    AC ac;
    Color color;
    carBodyDesign bodyDesign;
    AI automatedAI;
    Seat seat;

    public abstract double getCarPrice();
    public abstract String getCarDetails();
}