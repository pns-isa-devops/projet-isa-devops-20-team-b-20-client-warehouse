
package stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StartDelivery_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", "startDelivery");
    private final static QName _StartDeliveryResponse_QNAME = new QName("http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", "startDeliveryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StartDeliveryResponse }
     * 
     */
    public StartDeliveryResponse createStartDeliveryResponse() {
        return new StartDeliveryResponse();
    }

    /**
     * Create an instance of {@link StartDelivery }
     * 
     */
    public StartDelivery createStartDelivery() {
        return new StartDelivery();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", name = "startDelivery")
    public JAXBElement<StartDelivery> createStartDelivery(StartDelivery value) {
        return new JAXBElement<StartDelivery>(_StartDelivery_QNAME, StartDelivery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDeliveryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.polytech.unice.fr/si/4a/isa/dronedelivery/delivery", name = "startDeliveryResponse")
    public JAXBElement<StartDeliveryResponse> createStartDeliveryResponse(StartDeliveryResponse value) {
        return new JAXBElement<StartDeliveryResponse>(_StartDeliveryResponse_QNAME, StartDeliveryResponse.class, null, value);
    }

}
