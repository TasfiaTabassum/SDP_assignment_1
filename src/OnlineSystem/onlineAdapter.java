package OnlineSystem;
import java.time.LocalDate;

public class onlineAdapter implements mobileAdapter{
    private CentralOnlineSystem centralOnlineSystem;
    @Override
    public void requestCarServicing(String name, LocalDate date) {
        Command command = new RequestCarServicingCommand(name, date);
        centralOnlineSystem.addCommand(command);
    }
    @Override
    public void requestCarWash(String name, LocalDate date) {
        Command command = new RequestCarWashCommand(name, date);
        centralOnlineSystem.addCommand(command);
    }
    @Override
    public void requestOnlineDelivery(String name, LocalDate date) {
        Command command = new RequestOnlineDeliveryCommand(name, date);
        centralOnlineSystem.addCommand(command);
    }
}