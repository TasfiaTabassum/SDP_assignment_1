package OnlineSystem;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


interface carService{
    void execute();
}

class CarCommand implements carService{
    private CarService carService;

    public void CarServicingCommand(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void execute() {
        carService.ServiceCar();
    }
}

class CarService {
    public void ServiceCar(){
      System.out.println(" Car Serviced");
    }
}

 







