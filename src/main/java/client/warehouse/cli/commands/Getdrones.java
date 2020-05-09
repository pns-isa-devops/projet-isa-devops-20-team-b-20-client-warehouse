package client.warehouse.cli.commands;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.maintenance.Drone;

import java.util.List;

public class Getdrones extends Command {

    @Override
    public void execute(List<String> args) {
        List<Drone> drones = ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService().getDrones();
        if(drones.isEmpty()){
            System.out.println("There is no drone is the warehouse.");
            return;
        }
        System.out.println("\nDrone list :");
        for(Drone drone : drones){
            System.out.println(drone.getDroneId());
        }
        System.out.println();
    }

    @Override
    protected String help() {
        return "Gets the information of every drone in the system.";
    }

}
