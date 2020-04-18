package client.warehouse.cli.commands;

import java.util.List;

import client.warehouse.framework.ShellWarehouse;
import stubs.delivery.Delivery;

public class Getparcels extends Command {

    @Override
    public void execute(List<String> args) {
        List<Delivery> deliveries = ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService().checkForNewParcels();
        for (Delivery delivery : deliveries)
        {
            System.out.println(delivery.toString());
        }
        System.out.println("Parcels updated");
    }

    @Override
    protected String help() {
        return "Get new parcels from carrier api";
    }

}