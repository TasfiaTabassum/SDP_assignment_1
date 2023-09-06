package notification;

public class Subscription {
    private final String name;
    private final String email;

    public Subscription(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void requestSubscription(){
        notify.getInstance().addSubscriber(this);
    }
    public void update(String updateInfo){
        System.out.println("Dear Customer " + name + " " + updateInfo);
    }
}