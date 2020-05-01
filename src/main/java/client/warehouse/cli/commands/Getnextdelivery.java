package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;
import stubs.delivery.Delivery;

public class Getnextdelivery extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            Delivery delivery = ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService()
                    .getNextDelivery();
            System.out.println("Next delivery to prepare:" + "\nNumber: " + delivery.getDeliveryId() + "\nDrone: "
                    + delivery.getDrone().getDroneId() + "\nParcel number: " + delivery.getParcel().getParcelId());
        } catch (Exception e) {
            System.err.println("Delivery schedule is empty!");
        }
    }

    @Override
    protected String help() {
        return "See next delivery.";
    }
}
