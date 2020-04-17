package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.delivery.Exception_Exception;

public class Startdelivery extends Command {
    @Override
    public void execute(List<String> args) {
        if (args.isEmpty()) {
            System.err.println("No drone selected.");
            return;
        }
        System.out.println(String.format("Starting drone : %s.", args.get(0)));
        try {
            ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService().startDelivery(args.get(0));
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
        System.out.println("Drone launched!");
    }

    @Override
    protected String help() {
        return "Launches the drone.";
    }
}
