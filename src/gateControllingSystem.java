class remoteGateControlSystem extends CarDecor{
    public remoteGateControlSystem(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 1999;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nRemote Gate-Control System";
    }
}

class MobileAppGateControlDecorator extends CarDecor{
    public MobileAppGateControlDecorator(Car car) {
        this.car = car;
    }
    @Override
    public double getCarPrice() {
        return car.getCarPrice() + 599;
    }
    @Override
    public String getCarDetails() {
        return car.getCarDetails() + "\nMobile-App Gate-Control System";
    }
}
