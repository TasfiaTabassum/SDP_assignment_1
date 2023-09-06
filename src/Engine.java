public interface Engine {
    public String getEngineType();
    public double getEnginePrice();
}
class CC1300 implements Engine {
    @Override
    public String getEngineType() {
        return "CC1300";
    }
    @Override
    public double getEnginePrice() {
        return 10000;
    }
}
class CC1700 implements Engine {
    @Override
    public String getEngineType() {
        return "CC1700";
    }
    @Override
    public double getEnginePrice() {
        return 20000;
    }
}
class CC1800 implements Engine {
    @Override
    public String getEngineType() {
        return "CC1800";
    }
    @Override
    public double getEnginePrice() {
        return 30000;
    }
}
class CC2100 implements Engine {
    @Override
    public String getEngineType() {
        return "CC2100";
    }
    @Override
    public double getEnginePrice() {
        return 40000;
    }
}