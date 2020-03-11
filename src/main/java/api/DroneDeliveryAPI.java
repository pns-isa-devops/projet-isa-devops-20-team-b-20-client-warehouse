package api;


import stubs.DeliveryService;
import stubs.DeliveryServiceImplService;

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
        URL wsdlLocation = DroneDeliveryAPI.class.getResource("/DeliveryWS.wsdl");
        DeliveryServiceImplService factory = new DeliveryServiceImplService(wsdlLocation);
        this.deliveries = factory.getDeliveryServiceImplPort();
        String address = "http://" + host + ":" + port + "/dronedelivery-backend/webservices/DeliveryWS";
        ((BindingProvider) deliveries).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
    }
}
