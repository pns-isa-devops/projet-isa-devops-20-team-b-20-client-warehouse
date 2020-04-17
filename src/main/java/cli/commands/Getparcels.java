package cli.commands;

import java.util.List;

import framework.ShellWarehouse;

public class Getparcels extends Command {

    @Override
    public void execute(List<String> args) {
        ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService().checkForNewParcels();
        System.out.println("Parcels updated");
    }

    @Override
    String help() {
        return "Get new parcels from carrier api";
    }
    
}