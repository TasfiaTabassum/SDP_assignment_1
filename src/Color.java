public interface Color {
    public String getColorType();
    public double getColorPrice();
}
class red implements Color {
    @Override
    public String getColorType() {
        return "Red";
    }
    @Override
    public double getColorPrice() {
        return 1999;
    }
}
class white implements Color {
    @Override
    public String getColorType() {
        return "White";
    }
    @Override
    public double getColorPrice() {
        return 2999;
    }
}
class grey implements Color {
    @Override
    public String getColorType() {
        return "Grey";
    }
    @Override
    public double getColorPrice() {
        return 3999;
    }
}
class black implements Color {
    @Override
    public String getColorType() {
        return "Black";
    }
    @Override
    public double getColorPrice() {
        return 4999;
    }
}