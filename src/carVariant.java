// Singleton Pattern
class ShopManager {
    private static ShopManager instance;

    private ShopManager() { /* Private constructor */ }

    public static ShopManager getInstance() {
        if (instance == null) {
            instance = new ShopManager();
        }
        return instance;
    }
}