import api.DeliveryAPI;
import api.DroneMaintenanceAPI;
import cli.commands.*;
import framework.ShellWarehouse;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        String host = (args.length == 0 ? "localhost" : args[0]);
        String port = (args.length < 2 ? "8080" : args[1]);
        System.out.println("Starting Drone Delivery");
        System.out.println("  - Remote server: " + host);
        System.out.println("  - Port number:   " + port);
        ShellWarehouse s = new ShellWarehouse(new DeliveryAPI(host, port), new DroneMaintenanceAPI(host, port));
        s.register(
                Bye.class,
                Help.class,
                Getnextdelivery.class,
                Startdelivery.class,
                Setincharge.class,
                Adddrone.class,
                Setavailable.class,
                Setinreview.class
        );
        s.run();
    }
}
