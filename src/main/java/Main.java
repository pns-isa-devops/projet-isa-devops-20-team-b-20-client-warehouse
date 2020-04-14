import api.DroneDeliveryAPI;
import cli.commands.*;
import cli.framework.Shell;

public class Main
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        String host = ( args.length == 0 ? "localhost" : args[0] );
        String port = ( args.length < 2  ? "8080"      : args[1] );
        System.out.println("Starting Drone Delivery");
        System.out.println("  - Remote server: " + host);
        System.out.println("  - Port number:   " + port);
        Shell s = new Shell(new DroneDeliveryAPI(host, port));
        s.register(
                Bye.class,
                Help.class,
                Startdelivery.class,
                Chargedrone.class
        );
        s.run();
    }
}
