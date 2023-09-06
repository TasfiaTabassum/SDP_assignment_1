
public abstract class carShop {
    Car car;
    public static CarFactory getCarFactory(carType carType){
        return switch (carType) {
            case RACING -> new RacingCarFactory();
            case PRIVATE -> new PrivateCarFactory();
            case SUV -> new SUVCarFactory();
            case MILITARY -> new MilitaryCarFactory();
            default -> null;
        };
    }
    abstract Car orderCar(String color,carType carType);
}
class FordUSA extends carShop{

    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "Ford");
        return car;
    }
}
class FordAsia extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "Ford");
        return car;
    }
}
class FerrariUSA extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "Ferrari");
        return car;
    }
}
class FerrariAsia extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "Ferrari");
        return car;
    }
}
class BMWUSA extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "BMW");
        return car;
    }
}
class BMWAsia extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "BMW");
        return car;
    }
}
class ToyotaUSA extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "USA", "Toyota");
        return car;
    }
}
class ToyotaAsia extends carShop{
    @Override
    public Car orderCar(String color, carType carType) {
        CarFactory carFactory = getCarFactory(carType);
        car = carFactory.createCar(color, "Asia", "Toyota");
        return car;
    }
}