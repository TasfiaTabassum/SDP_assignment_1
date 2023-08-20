// component interface
interface openroof{
    String getDescription();
    int val();
}

class roof implements openroof{

    @Override
    public String getDescription(){
        return "YES/NO";
    }

    @Override
    public int val(){
        return 0;
    }
}

// Decorator interface
interface CarDecorator extends Car {
    // Additional methods for customizing/decorating
}

// Concrete Decorators (Customization Options)
class CustomizedOpenroofdDecorator implements CarDecorator {
    private Car car;
    private double cost;

    public CustomizedOpenroofdDecorator(Car car, double cost) {
        this.car = car;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Customized roof sytem";
    }

    @Override
    public double getCost() {
        return car.getCost() + cost;
    }
}

public class openRoof{
    public static void main(String[] args) {
        Car basicCar = new BasicCar();

        Car customizedCar = new CustomizedRainShieldDecorator(basicCar, 500);
        System.out.println("Customized Car: " + customizedCar.getDescription() + " - Cost: $" + customizedCar.getCost());

        
    }
}
