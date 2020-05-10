package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.maintenance.DroneCannotChangeStateException_Exception;
import stubs.maintenance.DroneNotFoundException_Exception;

public class Setinreview extends Command {

    @Override
    public void execute(List<String> args) {

        if(args.isEmpty()){
            System.err.println("Missing drone id\n" + this.help());
            return;
        }

        try {
            ((ShellWarehouse) this.shell).getDroneMaintenanceApi().getDroneMaintenanceService()
                    .reviewDrone(args.get(0));
            System.out.println("Drone " + args.get(0) + " is in REVIEW mode");

        } catch (DroneNotFoundException_Exception e) {
            System.out.println(e.getMessage());

        } catch (DroneCannotChangeStateException_Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String help() {
        return "setinreview <drone_id> : Set the drone in review state";
    }
}
