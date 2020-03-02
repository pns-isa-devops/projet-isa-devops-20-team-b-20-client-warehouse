package stubs.delivery;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", name = "DeliveryService")

public interface DeliveryService
{
    @WebMethod

    void startDelivery(
            @WebParam(name = "delivery_id", targetNamespace = "")
                    java.lang.String delivery_id
    );
}
