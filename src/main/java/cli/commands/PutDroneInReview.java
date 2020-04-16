package cli.commands;

import api.DroneMaintenanceAPI;

import java.util.List;

public class PutDroneInReview extends Command {

    @Override
    public void execute(List<String> args) {
        if (((DroneMaintenanceAPI) this.shell.getServiceAPI()).getDroneMaintenanceService().reviewDrone(args.get(0))) {
            System.out.println("Drone " + args.get(0) + " is in REVIEW mode");
        } else {
            System.out.println("Drone " + args.get(0) + " doesn't exist");
        }
    }

    @Override
    String help() {
        return "reviewdrone <drone_id> : Set the drone in review state";
    }
}
