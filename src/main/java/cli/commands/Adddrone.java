package cli.commands;

import api.DroneMaintenanceAPI;
import cli.framework.APIName;
import stubs.delivery.Drone;

import java.util.List;

public class Adddrone extends Command {
    @Override
    public void execute(List<String> args) {
        ((DroneMaintenanceAPI) this.shell.getServiceAPI(APIName.DRONE_MAINTENANCE)).getDroneMaintenanceService().addDrone();
        System.out.println("Drone added to warehouse.");
    }

    @Override
    String help() {
        return "addDrone : Adds a drone to the system.";
    }
}
