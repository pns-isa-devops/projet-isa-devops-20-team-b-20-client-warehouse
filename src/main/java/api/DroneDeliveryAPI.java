package api;

import stubs.delivery.DeliveryService;
import stubs.delivery.DeliveryServiceImplService;
import stubs.maintenance.DroneMaintenanceService;
import stubs.maintenance.DroneMaintenanceServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class DroneDeliveryAPI extends ServiceAPI {

    private DeliveryService deliveryService;
    public DroneMaintenanceService maintenanceService;

    public DroneDeliveryAPI(String host, String port) {
        super(host, port);
        initMaintenance(host,port); //TODO MOVE
    }

    public DeliveryService getDeliveryService(){
        return this.deliveryService;
    }

    /**
     * TODO move to the right API
     * @param host
     * @param port
     */
    public void initMaintenance(String host, String port)
    {
        URL wsdlLocation = DroneDeliveryAPI.class.getResource("/DroneMaintenanceWS.wsdl");
        DroneMaintenanceServiceImplService factory = new DroneMaintenanceServiceImplService(wsdlLocation);
        this.maintenanceService = factory.getDroneMaintenanceServiceImplPort();
        String address = "http://" + host + ":" + port + "/drone-delivery-backend/webservices/DroneMaintenanceWS?wsdl";
        ((BindingProvider) maintenanceService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }

    @Override
    protected void initializeService(String host, String port) {
        URL wsdlLocation = DroneDeliveryAPI.class.getResource("/DeliveryWS.wsdl");
        DeliveryServiceImplService factory = new DeliveryServiceImplService(wsdlLocation);
        this.deliveryService = factory.getDeliveryServiceImplPort();
        String address = "http://" + host + ":" + port + "/drone-delivery-backend/webservices/DeliveryWS?wsdl";
        ((BindingProvider) deliveryService).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }
}
