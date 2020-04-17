package framework;

import api.DeliveryAPI;
import api.DroneMaintenanceAPI;
import cli.framework.Shell;

public class ShellWarehouse extends Shell {
    
    private DeliveryAPI deliveryServiceAPI;
    private DroneMaintenanceAPI droneMaintenanceApi;

    public ShellWarehouse(DeliveryAPI deliveryServiceAPI, DroneMaintenanceAPI droneMaintenancApi) {
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