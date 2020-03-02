package stubs.delivery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;

public class DeliveryServiceImplService extends Service
{
    private final static QName SERVICE = new QName("http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", "DeliveryServiceImplService");
    public final static QName DeliveryServiceImplPort = new QName("http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", "DeliveryServiceImplPort");

    public DeliveryServiceImplService(URL wsdlLocation)
    {
        super(wsdlLocation, SERVICE);
    }

    /**
     *
     * @return
     *     returns CartWebService
     */
    @WebEndpoint(name = "DeliveryServiceImplPort")
    public DeliveryService getDeliveriesServiceImplPort() {
        return super.getPort(DeliveryServiceImplPort, DeliveryService.class);
    }
}
