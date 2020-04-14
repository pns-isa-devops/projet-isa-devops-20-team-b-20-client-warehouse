package cli.commands;

import api.DroneDeliveryAPI;
import stubs.maintenance.Exception_Exception;

import java.util.List;

public class Availabledrone extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            if(((DroneDeliveryAPI)this.shell.getDroneDeliveryAPI()).maintenanceService.setAvailableDrone(args.get(0))){
                System.out.println("Drone "+args.get(0)+ " is AVAILABLE");
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
        return "availabledrone <drone_id> : Make the drone available";
    }
}
