class ThickRainShield extends CarDecor{
    public ThickRainShield(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 5000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nThick Rain Shield";
    }
}
class ThinRainShield extends CarDecor{
    public ThinRainShield(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 2500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nThin Rain Shield";
    }
}
class CurvedRainShield extends CarDecor{
    public CurvedRainShield(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 7000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nCurved Rain Shield";
    }
}