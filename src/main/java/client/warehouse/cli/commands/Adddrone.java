package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;

public class Adddrone extends Command {
    @Override
    public void execute(List<String> args) {

        ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().addDrone();
        System.out.println("Drone added to warehouse.");
    }

    @Override
    protected String help() {
        return "addDrone : Adds a drone to the system.";
    }
}
