package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.maintenance.DroneNotFoundException_Exception;

public class Setavailable extends Command {
    @Override
    public void execute(List<String> args) {

        if(args.isEmpty()){
            System.err.println("Missing drone id\n" + this.help());
            return;
        }

        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService()
                    .setAvailableDrone(args.get(0));
            System.out.println("Drone " + args.get(0) + " is AVAILABLE");

        } catch (DroneNotFoundException_Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String help() {
        return "setavailable <drone_id> : Makes the drone available";
    }
}
