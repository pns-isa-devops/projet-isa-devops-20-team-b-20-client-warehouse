package cli.commands;

import framework.ShellWarehouse;

import java.util.List;

public class Setavailable extends Command {
    @Override
    public void execute(List<String> args) {
        if (((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().setAvailableDrone(args.get(0))) {
            System.out.println("Drone " + args.get(0) + " is AVAILABLE");
        } else {
            System.out.println("Drone " + args.get(0) + " doesn't exist");
        }
    }

    @Override
    String help() {
        return "availabledrone <drone_id> : Make the drone available";
    }
}
