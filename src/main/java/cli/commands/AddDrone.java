package cli.commands;

import api.DroneMaintenanceAPI;
import stubs.delivery.Drone;

import java.util.List;

public class AddDrone extends Command {
    @Override
    public void execute(List<String> args) {
        //((DroneMaintenanceAPI) this.shell.getServiceAPI()).deliveries.scheduleDelivery(args.get(0), args.get(1));
        Drone drone; // = get
        System.out.println("Adding drone to warehouse.");
    }

    @Override
    String help() {
        return "Adds a drone to the system.";
    }
}
