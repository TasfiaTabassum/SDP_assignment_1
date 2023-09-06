class looseBumper extends CarDecor{
    public looseBumper(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 5500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nLoose Bumper";
    }
}

class tightBumper extends CarDecor{
    public tightBumper(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 7500;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nTight Bumper";
    }
}