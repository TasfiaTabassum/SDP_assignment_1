public interface Chassis {
    public String getChassisType();
    public double getChassisPrice();
}
class tabularChassis implements Chassis {
    @Override
    public String getChassisType() {
        return "Tabular";
    }
    @Override
    public double getChassisPrice() {
        return 19000;
    }
}
class backboneChassis implements Chassis {
    @Override
    public String getChassisType() {
        return "Backbone";
    }
    @Override
    public double getChassisPrice() {
        return 29000;
    }
}
 class ladderFrameChassis implements Chassis {
    @Override
    public String getChassisType() {
        return "LadderFrame";
    }
    @Override
    public double getChassisPrice() {
        return 39000;
    }
}