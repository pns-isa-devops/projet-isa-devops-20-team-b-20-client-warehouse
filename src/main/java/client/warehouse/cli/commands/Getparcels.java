package client.warehouse.cli.commands;

import java.util.List;

import client.utils.cli.commands.Command;
import client.warehouse.framework.ShellWarehouse;

public class Getparcels extends Command {

    @Override
    public void execute(List<String> args) {
        ((ShellWarehouse) this.shell).getDeliveryServiceAPI().getDeliveryService().checkForNewParcels();
        System.out.println("Parcels updated");
    }

    @Override
    protected String help() {
        return "Get new parcels from carrier api";
    }

}
