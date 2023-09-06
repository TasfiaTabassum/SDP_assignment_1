package notification;

import java.util.ArrayList;
import java.util.List;

public class notify {
    private List<Subscription> subscriberList = new ArrayList<>();
    private static notify notificationSystem;

    public static notify getInstance(){
        if(notificationSystem == null){
            notificationSystem = new notify();
        }
        return notificationSystem;
    }
    public void addSubscriber(Subscription subscriber){
        subscriberList.add(subscriber);
    }
    public void removeSubscriber(Subscription subscriber){
        subscriberList.remove(subscriber);
    }
    public void notifyPriceChange(){
        for(Subscription subscriber : subscriberList){
            subscriber.update("Price has changed");
        }
    }
    public void notifyFeatureChange(){
        for(Subscription subscriber : subscriberList){
            subscriber.update("Feature has changed");
        }
    }
}
