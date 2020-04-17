package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.maintenance.DroneNotFoundException_Exception;

public class Setincharge extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService()
                    .chargeDrone(args.get(0));
            System.out.println("Drone " + args.get(0) + " is in CHARGE mode");
        } catch (DroneNotFoundException_Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String help() {
        return "chargedrone <id_drone> : puts the drone in charge mode.";
    }
}
