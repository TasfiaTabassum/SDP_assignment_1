package OnlineSystem;

interface carDelievery {
    void execute();
}

class OnlineDeliveryCommand implements carDelievery {
    private OnlineShop onlineShop;

    public OnlineDeliveryCommand(OnlineShop onlineShop) {
        this.onlineShop = onlineShop;
    }

    @Override
    public void execute() {
        onlineShop.Delivery();
    }
}

// Reciever
class OnlineDelivery{
    public void Delivery(){
        System.out.println("Delievery");
    }
}