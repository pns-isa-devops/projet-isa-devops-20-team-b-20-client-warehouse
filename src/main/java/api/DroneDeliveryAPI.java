package api;

import stubs.delivery.DeliveryService;
import stubs.delivery.DeliveryServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class DroneDeliveryAPI
{
    public DeliveryService deliveries;

    public DroneDeliveryAPI(String host, String port) {
        initDeliveries(host, port);
    }

    private void initDeliveries(String host, String port)
    {
        URL wsdlLocation = DroneDeliveryAPI.class.getResource("/CartWS.wsdl");
        DeliveryServiceImplService factory = new DeliveryServiceImplService(wsdlLocation);
        this.deliveries = factory.getDeliveriesServiceImplPort();
        String address = "http://" + host + ":" + port + "/dronedelivery-backend/webservices/DeliveryWS";
        ((BindingProvider) deliveries).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }
}
