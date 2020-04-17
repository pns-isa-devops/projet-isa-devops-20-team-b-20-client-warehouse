package client.warehouse.api;

import stubs.maintenance.DroneMaintenanceService;
import stubs.maintenance.DroneMaintenanceServiceImplService;

import javax.xml.ws.BindingProvider;

import client.utils.api.ServiceAPI;

import java.net.URL;

public class DroneMaintenanceAPI extends ServiceAPI {

    private DroneMaintenanceService droneMaintenanceService;

    public DroneMaintenanceAPI(String host, String port) {
        super(host, port);
    }

    public DroneMaintenanceService getDroneMaintenanceService() {
        return this.droneMaintenanceService;
    }

    @Override
    protected void initializeService(String host, String port) {
        URL wsdlLocation = DeliveryAPI.class.getResource("/DroneMaintenanceWS.wsdl");
        DroneMaintenanceServiceImplService factory = new DroneMaintenanceServiceImplService(wsdlLocation);
        this.droneMaintenanceService = factory.getDroneMaintenanceServiceImplPort();
        String address = "http://" + host + ":" + port + "/drone-delivery-backend/webservices/DroneMaintenanceWS?wsdl";
        ((BindingProvider) droneMaintenanceService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                address);
    }

}
