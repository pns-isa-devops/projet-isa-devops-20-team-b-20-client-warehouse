package client.warehouse.framework;

import client.utils.cli.framework.Shell;
import client.warehouse.api.DeliveryAPI;
import client.warehouse.api.DroneMaintenanceAPI;

public class ShellWarehouse extends Shell {

    private DeliveryAPI deliveryServiceAPI;
    private DroneMaintenanceAPI droneMaintenanceApi;

    public ShellWarehouse(DeliveryAPI deliveryServiceAPI, DroneMaintenanceAPI droneMaintenancApi) {
        super("client.warehouse.cli.commands");
        this.deliveryServiceAPI = deliveryServiceAPI;
        this.droneMaintenanceApi = droneMaintenancApi;
    }

    public DeliveryAPI getDeliveryServiceAPI() {
        return deliveryServiceAPI;
    }

    public DroneMaintenanceAPI getDroneMaintenanceApi() {
        return droneMaintenanceApi;
    }

}
