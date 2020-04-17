package cli.commands;

import framework.ShellWarehouse;
import stubs.maintenance.DroneNotFoundException_Exception;

import java.util.List;

public class Setavailable extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().setAvailableDrone(args.get(0));
            System.out.println("Drone " + args.get(0) + " is AVAILABLE");

        } catch (DroneNotFoundException_Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    String help() {
        return "availabledrone <drone_id> : Make the drone available";
    }
}
