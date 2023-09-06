public interface AI {
    public String getRegion();
    public double getCost();
}
class AsiaAutomatedAI implements AI {
    public String getRegion() {
        return "Asia";
    }
    public double getCost() {
        return 15000;
    }
}
class USAAutomatedAI implements AI {
    public String getRegion() {
        return "USA";
    }
    public double getCost() {
        return 25000;
    }
}