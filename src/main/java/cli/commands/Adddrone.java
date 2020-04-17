package cli.commands;

import framework.ShellWarehouse;
import java.util.List;

public class Adddrone extends Command {
    @Override
    public void execute(List<String> args) {
        
        ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().addDrone();
        System.out.println("Drone added to warehouse.");
    }

    @Override
    String help() {
        return "addDrone : Adds a drone to the system.";
    }
}
