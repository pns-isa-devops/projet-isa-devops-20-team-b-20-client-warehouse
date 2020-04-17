package cli.commands;

import api.DroneMaintenanceAPI;

import java.util.List;
import framework.ShellWarehouse;
import stubs.maintenance.DroneNotFoundException_Exception;

public class Setinreview extends Command {

    @Override
    public void execute(List<String> args) {
         try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().reviewDrone(args.get(0));
            System.out.println("Drone "+args.get(0)+ " is in REVIEW mode");

        } catch (DroneNotFoundException_Exception e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    String help() {
        return "reviewdrone <drone_id> : Set the drone in review state";
    }
}
