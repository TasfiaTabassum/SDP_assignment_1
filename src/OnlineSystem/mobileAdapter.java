package OnlineSystem;
import java.time.LocalDate;

public interface mobileAdapter {
    void requestCarServicing(String name, LocalDate date);
    void requestCarWash(String name, LocalDate date);
    void requestOnlineDelivery(String name, LocalDate date);
}