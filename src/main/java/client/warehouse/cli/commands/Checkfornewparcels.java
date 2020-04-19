package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.delivery.Delivery;

public class Checkfornewparcels extends Command {

    @Override
    public void execute(List<String> args) {
        List<Delivery> deliveries = ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService()
                .checkForNewParcels();

        if (deliveries.isEmpty()) {
            System.out.println("Nothing to update");
        } else {
            for (Delivery delivery : deliveries) {
                System.out.println(delivery.getDeliveryId());
            }
            System.out.println("Parcels updated");
        }
    }

    @Override
    protected String help() {
        return "Get new parcels from carrier api";
    }

}
