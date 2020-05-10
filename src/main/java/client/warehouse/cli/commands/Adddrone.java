package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.maintenance.InvalidDroneIDException_Exception;

public class Adddrone extends Command {
    @Override
    public void execute(List<String> args) {

        if(args.isEmpty()){
            System.err.println("Missing drone id\n" + this.help());
            return;
        }

        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().addDrone(args.get(0));
            System.out.println("Drone added to warehouse.");
        } catch (InvalidDroneIDException_Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String help() {
        return "addDrone <droneid> : Adds a drone to the system.";
    }
}
