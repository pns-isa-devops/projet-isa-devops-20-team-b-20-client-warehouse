
import client.utils.cli.commands.Bye;
import client.utils.cli.commands.Help;
import client.warehouse.api.DeliveryAPI;
import client.warehouse.api.DroneMaintenanceAPI;
import client.warehouse.cli.commands.Adddrone;
import client.warehouse.cli.commands.Checkfornewparcels;
import client.warehouse.cli.commands.Getnextdelivery;
import client.warehouse.cli.commands.Setavailable;
import client.warehouse.cli.commands.Setincharge;
import client.warehouse.cli.commands.Setinreview;
import client.warehouse.cli.commands.Startdelivery;
import client.warehouse.framework.ShellWarehouse;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        String host = (args.length == 0 ? "localhost" : args[0]);
        String port = (args.length < 2 ? "8080" : args[1]);
        System.out.println("Starting Drone Delivery");
        System.out.println("  - Remote server: " + host);
        System.out.println("  - Port number:   " + port);
        ShellWarehouse s = new ShellWarehouse(new DeliveryAPI(host, port), new DroneMaintenanceAPI(host, port));
        s.register(Bye.class, Help.class, Getnextdelivery.class, Startdelivery.class, Setincharge.class, Adddrone.class,
                Setavailable.class, Setinreview.class, Checkfornewparcels.class);
        s.run();
    }
}
