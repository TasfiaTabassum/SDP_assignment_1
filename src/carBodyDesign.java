public interface carBodyDesign {
    public String getBodyDesignType();
    public double getBodyDesignPrice();
}
class FordBodyDesign implements carBodyDesign {
    @Override
    public String getBodyDesignType() {
        return "Ford";
    }

    @Override
    public double getBodyDesignPrice() {
        return 130000;
    }
}
class FerrariBodyDesign implements carBodyDesign {
    @Override
    public String getBodyDesignType() {
        return "Ferrari";
    }

    @Override
    public double getBodyDesignPrice() {
        return 270000;
    }
}
class ToyotaBodyDesign implements carBodyDesign {
    @Override
    public String getBodyDesignType() {
        return "Toyota";
    }

    @Override
    public double getBodyDesignPrice() {
        return 310000;
    }
}
class BMWBodyDesign implements carBodyDesign {
    @Override
    public String getBodyDesignType() {
        return "BMW";
    }

    @Override
    public double getBodyDesignPrice() {
        return 440000;
    }
}