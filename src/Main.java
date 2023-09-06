import notification.notify;
import notification.Subscription;

public class Main {
    public static void main(String[] args) {
        //car shop test
        System.out.println("*****************  Demo 1  *****************");
        CarFactory carFactory = new RacingCarFactory();
        Car car = carFactory.createCar("Grey", "Asia", "Ford");
        System.out.println(car.getCarDetails());
        carFactory = new PrivateCarFactory();
        car = carFactory.createCar("Black", "Asia", "Ford");
        System.out.println(car.getCarDetails());



        System.out.println("*****************  Demo 2  *****************");
        carShop carShop1 = new FordUSA();
        Car car1 = carShop1.orderCar("Black", carType.RACING);
        Car car2 = carShop1.orderCar("Red", carType.SUV);
        Car car3 = carShop1.orderCar("White", carType.PRIVATE);
        System.out.println(car1.getCarDetails());
        System.out.println(car2.getCarDetails());
        System.out.println(car3.getCarDetails());


        System.out.println("*****************  Demo 3  *****************");
        //test CarDecorator
        carShop carShop2 = new FordUSA();
        car = carShop2.orderCar("White", carType.RACING);
        car = new openRoof(car);
        car = new looseBumper(new CurvedRainShield(car));
        System.out.println(car.getCarDetails());

        System.out.println("*****************  Demo 4  *****************");

        //test notification system
        notify notificationSystem = new notify();
        System.out.println("Adding subscriber" + " Harry");
        notificationSystem.addSubscriber(new Subscription("Harry","harry@email.com"));
        System.out.println("Adding subscriber" + " Potter");
        notificationSystem.addSubscriber(new Subscription("Potter","potter@email.com"));
        System.out.println("Adding subscriber" + " Hermaine");
        notificationSystem.addSubscriber(new Subscription("Hermaine","harmine@email.com"));

        System.out.println("Notify change in price !");
        notificationSystem.notifyPriceChange();
        System.out.println("Notify change in car features !");
        notificationSystem.notifyFeatureChange();




    }
}