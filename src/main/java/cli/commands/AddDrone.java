package cli.commands;

import api.DroneMaintenanceAPI;
import stubs.delivery.Drone;

import java.util.List;

public class AddDrone extends Command {
    @Override
    public void execute(List<String> args) {
        ((DroneMaintenanceAPI) this.shell.getServiceAPI()).getDroneMaintenanceService().addDrone();
        System.out.println("Drone added to warehouse.");
    }

    @Override
    String help() {
        return "addDrone : Adds a drone to the system.";
    }
}
