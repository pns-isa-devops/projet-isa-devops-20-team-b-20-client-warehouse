package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.delivery.Delivery;

public class Startdelivery extends Command {
    @Override
    public void execute(List<String> args) {
        if(args.isEmpty()){
            System.err.println("Missing drone id\n" + this.help());
            return;
        }
        try {
            System.out.println(String.format("Starting delivery : %s.", args.get(0)));
            Delivery delivery = ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService().startDelivery(args.get(0));
            System.out.printf("Drone %s launced!", delivery.getDrone().getDroneId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected String help() {
        return "startdelivery <deliveryid> : Launches the drone.";
    }
}
