package cli.commands;

import framework.ShellWarehouse;
import stubs.maintenance.DroneNotFoundException_Exception;

import java.util.List;

public class Setincharge extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().chargeDrone(args.get(0));
            System.out.println("Drone "+args.get(0)+ " is in CHARGE mode");
        } catch (DroneNotFoundException_Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    String help() {
        return "chargedrone <id_drone> : puts the drone in charge mode.";
    }
}
