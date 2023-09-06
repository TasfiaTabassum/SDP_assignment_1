class ThickRainShield extends CarDecorator{
    public ThickRainShield(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1000;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nThick Rain Shield";
    }
}

class ThinRainShield extends CarDecorator{
    public ThinRainShield(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nThin Rain Shield";
    }
}

class CurvedRainShield extends CarDecorator{
    public CurvedRainShield(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nCurved Rain Shield";
    }
}