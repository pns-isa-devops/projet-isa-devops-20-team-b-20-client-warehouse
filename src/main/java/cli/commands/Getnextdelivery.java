package cli.commands;

import framework.ShellWarehouse;
import stubs.delivery.Delivery;

import java.util.List;

public class Getnextdelivery extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            Delivery delivery = ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService().getNextDelivery();
            System.out.println("Next delivery to prepare:"
                    + "\nNumber: " + delivery.getDeliveryId()
                    + "\nDrone: " + delivery.getDrone().getDroneId()
                    + "\nParcel number: " + delivery.getParcel().getParcelId()
            );
        } catch (NullPointerException e) {
            System.err.println("Delivery schedule is empty!");
        }
    }

    @Override
    String help() {
        return "See next delivery.";
    }
}
