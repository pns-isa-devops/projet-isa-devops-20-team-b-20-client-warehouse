package cli.commands;

import api.DroneDeliveryAPI;
import stubs.maintenance.Exception_Exception;

import java.util.List;

public class Reviewdrone extends Command {

    @Override
    public void execute(List<String> args) {
        try {
            if(((DroneDeliveryAPI)this.shell.getDroneDeliveryAPI()).maintenanceService.reviewDrone(args.get(0))){
                System.out.println("Drone "+args.get(0)+ " is in REVIEW mode");
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
        return "reviewdrone <drone_id> : Set the drone in review state";
    }
}
