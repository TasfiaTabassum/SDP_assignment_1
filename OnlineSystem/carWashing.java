package OnlineSystem;

interface carWashing{
    void execute();
}

class CarWash {
    public void washCar(){
      System.out.println(" Car Washed");
    }
}

class CarWashingCommand implements carWashing {
    private CarWash carWash;

    public CarWashingCommand(CarWash carWash) {
        this.carWash = carWash;
    }

    @Override
    public void execute() {
        carWash.washCar();
    }
}