package api;

import stubs.delivery.DeliveryService;
import stubs.delivery.DeliveryServiceImplService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class DroneDeliveryAPI extends ServiceAPI {

    private DeliveryService deliveryService;

    public DroneDeliveryAPI(String host, String port) {
        super(host, port);
    }

    public DeliveryService getDeliveryService(){
        return this.deliveryService;
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
