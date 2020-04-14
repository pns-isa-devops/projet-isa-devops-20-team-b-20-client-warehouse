package cli.commands;

import api.DroneDeliveryAPI;
import stubs.maintenance.Exception_Exception;

import java.util.List;

public class Chargedrone extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            ((DroneDeliveryAPI)this.shell.getDroneDeliveryAPI()).maintenanceService.chargeDrone(args.get(0));
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    String help() {
        return "chargedrone <id_drone> : charge the drone.";
    }
}
