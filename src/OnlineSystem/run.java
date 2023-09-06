package OnlineSystem;
import java.time.LocalDate;

public class run {
    public static void main(String[] args) {
        CentralOnlineSystem centralOnlineSystem = CentralOnlineSystem.getInstance();
        System.out.println("********************  Demo  ********************");
        Command command = new RequestCarServicingCommand("Tasfia",LocalDate.of(2023, 8, 24));
        centralOnlineSystem.addCommand(command);
        command = new RequestCarServicingCommand("Tabassum", LocalDate.of(2023, 7, 23));
        centralOnlineSystem.addCommand(command);
        command = new RequestCarWashCommand("Sidratul", LocalDate.of(2023, 6, 22));
        centralOnlineSystem.addCommand(command);
        command = new RequestOnlineDeliveryCommand("Rahim", LocalDate.of(2023, 4, 21));
        centralOnlineSystem.addCommand(command);
        centralOnlineSystem.processCommand();
    }
}