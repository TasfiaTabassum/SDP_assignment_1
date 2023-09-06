public class openRoof extends CarDecorator{
    public OpenRoofDecor(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 2500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nOpen Roof";
    }
}