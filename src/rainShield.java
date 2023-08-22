// Component Interface
interface Car {
    String getDescription();
    double getCost();
}

// Concrete Component (Basic Car Model)
class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 20000;
    }
}

// Decorator Interface
interface CarDecorator extends Car {
    // Additional methods for customizing/decorating
}

// Concrete Decorators (Customization Options)
class CustomizedRainShieldDecorator implements CarDecorator {
    private Car car;
    private double cost;

    public CustomizedRainShieldDecorator(Car car, double cost) {
        this.car = car;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Customized Rain Shield";
    }

    @Override
    public double getCost() {
        return car.getCost() + cost;
    }
}

class BumperDecorator implements CarDecorator {
    private Car car;
    private double cost;

    public BumperDecorator(Car car, double cost) {
        this.car = car;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Bumper";
    }

    @Override
    public double getCost() {
        return car.getCost() + cost;
    }
}


public class rainShield {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();

        Car customizedCar = new CustomizedRainShieldDecorator(basicCar, 500);
        System.out.println("Customized Car: " + customizedCar.getDescription() + " - Cost: $" + customizedCar.getCost());

        Car bumperCustomizedCar = new BumperDecorator(customizedCar, 800);
        System.out.println("Bumper Customized Car: " + bumperCustomizedCar.getDescription() + " - Cost: $" + bumperCustomizedCar.getCost());
    }
}
 
    

