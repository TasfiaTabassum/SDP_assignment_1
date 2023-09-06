public abstract class CarFactory {
    Car car;
    public abstract Car createCar(String color,String region,String brand);

    public static Color getColor(String color){
        if(color.equalsIgnoreCase("red")){
            return new red();
        }
        else if(color.equalsIgnoreCase("white")){
            return new white();
        }
        else if(color.equalsIgnoreCase("grey")){
            return new grey();
        }
        else if(color.equalsIgnoreCase("black")){
            return new black();
        }
        return null;
    }
    public static carBodyDesign getDesignByBrand(String design){
        if(design.equalsIgnoreCase("ferrari")){
            return new FerrariBodyDesign();
        }
        else if(design.equalsIgnoreCase("ford")){
            return new FordBodyDesign();
        }
        else if(design.equalsIgnoreCase("toyota")){
            return new ToyotaBodyDesign();
        }
        else if(design.equalsIgnoreCase("bmw")){
            return new BMWBodyDesign();
        }
        return null;
    }
    public static AI getAutomatedAI(String region){
        if(region.equalsIgnoreCase("asia")){
            return new AsiaAutomatedAI();
        }
        else if(region.equalsIgnoreCase("usa")){
            return new USAAutomatedAI();
        }
        return null;
    }
}
class RacingCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, String brand)
    {
        car = new racingCar(
                new CC1800(),
                new SlickTire(),
                new ladderFrameChassis(),
                new HighPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new racingCarSeat()
        );
        return car;
    }
}

class PrivateCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, String brand) {
        car = new privateCar(
                new CC1300(),
                new SpareTire(),
                new backboneChassis(),
                new LowPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new privateCarSeat()
        );
        return car;
    }
}

class SUVCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, String brand) {
        car = new SUV(
                new CC1700(),
                new WhitewallTire(),
                new ladderFrameChassis(),
                new HighPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new SUVCarSeat()
        );
        return car;
    }
}

class MilitaryCarFactory extends CarFactory {
    @Override
    public Car createCar(String color, String region, String brand) {
        car = new militaryCar(
                new CC2100(),
                new SnowTire(),
                new ladderFrameChassis(),
                new HighPoweredAC(),
                getColor(color),
                getDesignByBrand(brand),
                getAutomatedAI(region),
                new militaryCarSeat()
        );
        return car;
    }
}