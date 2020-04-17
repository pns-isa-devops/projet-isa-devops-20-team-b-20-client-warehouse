package cli.commands;

import framework.ShellWarehouse;

import java.util.List;

public class Setincharge extends Command {
    @Override
    public void execute(List<String> args) {
        if (((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().chargeDrone(args.get(0))) {
            System.out.println("Drone " + args.get(0) + " is in CHARGE mode");
        } else {
            System.out.println("Drone " + args.get(0) + " doesn't exist");
        }
    }

    @Override
    String help() {
        return "chargedrone <id_drone> : puts the drone in charge mode.";
    }
}
