package notification;
import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Subject interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Concrete Subject (Notification System)
class NotificationSystem implements Subject {
    private List<Observer> observers;

    public NotificationSystem() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Concrete Observers (Clients)
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

public class notify {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");        
        Client client3 = new Client("Client 3");
        Client client4 = new Client("Client 4");

        notificationSystem.addObserver(client1);
        notificationSystem.addObserver(client2);
        notificationSystem.addObserver(client3);
        notificationSystem.addObserver(client4);

        notificationSystem.notifyObservers("New price for Ferrari: $200,000");
        notificationSystem.notifyObservers("New features added to Ford SUV");

        notificationSystem.removeObserver(client1);
        notificationSystem.notifyObservers("This message won't be received by client 1");
    }
}
