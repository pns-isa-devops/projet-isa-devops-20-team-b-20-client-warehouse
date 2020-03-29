package cli.commands;

import api.DroneDeliveryAPI;
import stubs.delivery.Delivery;
import stubs.delivery.Exception_Exception;

import java.util.List;

public class Getnextdelivery extends Command {
    @Override
    public void execute(List<String> args) {
        try {
            Delivery delivery = ((DroneDeliveryAPI) this.shell.getDroneDeliveryAPI()).deliveries.getNextDelivery();
            System.out.println("Prochaine livraison à préparer:"
                    + "\nNuméro: " + delivery.getDeliveryNumber()
                    + "\nDrone: " + delivery.getDrone().getDroneId()
                    + "\nNuméro de colis: " + delivery.getParcel().getParcelNumber()
                    );
        } catch (Exception_Exception e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Delivery schedule is empty !");
        }
    }

    @Override
    String help() {
        return "See next delivery";
    }
}
