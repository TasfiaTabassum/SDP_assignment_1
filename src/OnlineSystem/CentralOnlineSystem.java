package OnlineSystem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CentralOnlineSystem {
    public static CentralOnlineSystem centralOnlineSystem;
    private Queue<Command> commandQueue;
    private ArrayList<LocalDate> servicingDates;

    private CentralOnlineSystem(){
        commandQueue = new LinkedList<>();
        servicingDates = new ArrayList<>();
    }
    public static CentralOnlineSystem getInstance(){
        if(centralOnlineSystem == null){
            centralOnlineSystem = new CentralOnlineSystem();
        }
        return centralOnlineSystem;
    }
    public void addCommand(Command command){
        commandQueue.add(command);
        servicingDates.add(command.getDate());
    }
    void processCommand(){
        while(!commandQueue.isEmpty()){
            Command command = commandQueue.poll();
            command.execute();
        }
    }
}