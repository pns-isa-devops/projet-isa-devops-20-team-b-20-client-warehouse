package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.maintenance.InvalidDroneIDException_Exception;

public class Adddrone extends Command {
    @Override
    public void execute(List<String> args) {

        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().addDrone(args.get(0));
        } catch (InvalidDroneIDException_Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Drone added to warehouse.");
    }

    @Override
    protected String help() {
        return "addDrone : Adds a drone to the system.";
    }
}
