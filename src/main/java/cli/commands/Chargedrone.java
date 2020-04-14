package cli.commands;

import api.DroneDeliveryAPI;
import stubs.maintenance.Exception_Exception;

import java.util.List;

public class Chargedrone extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            if(((DroneDeliveryAPI)this.shell.getDroneDeliveryAPI()).maintenanceService.chargeDrone(args.get(0))){
                System.out.println("Drone "+args.get(0)+ " is in CHARGE mode");
            }
            else{
                System.out.println("Drone "+args.get(0)+ " doesn't exist");
            }
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    String help() {
        return "chargedrone <id_drone> : charge the drone.";
    }
}
