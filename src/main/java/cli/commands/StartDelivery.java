package cli.commands;

import stubs.delivery.Exception_Exception;

import java.util.List;
import api.DroneDeliveryAPI;

public class StartDelivery extends Command
{
    @Override
    public void execute(List<String> args)
    {
        if(args.isEmpty()) {
            System.err.println("No drone selected.");
            return;
        }
        System.out.println(String.format("Starting drone : %s.", args.get(0)));
        try {
            ((DroneDeliveryAPI)this.shell.getServiceAPI()).getDeliveryService().startDelivery(args.get(0));
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
        System.out.println("Drone launched!");
    }

    @Override
    String help()
    {
        return "Launches the drone.";
    }
}
