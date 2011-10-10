
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.v1.tudelft.atlantis.st.ewi.tudelft.nl package. 
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

    private final static QName _ExchCurrencyResponse_QNAME = new QName("nl.tudelft.ewi.st.atlantis.tudelft.v1.services", "exchCurrencyResponse");
    private final static QName _ExchCurrencyRequest_QNAME = new QName("nl.tudelft.ewi.st.atlantis.tudelft.v1.services", "exchCurrencyRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.v1.tudelft.atlantis.st.ewi.tudelft.nl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExchCurrencyResponse }
     * 
     */
    public ExchCurrencyResponse createExchCurrencyResponse() {
        return new ExchCurrencyResponse();
    }

    /**
     * Create an instance of {@link ExchCurrencyRequest }
     * 
     */
    public ExchCurrencyRequest createExchCurrencyRequest() {
        return new ExchCurrencyRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "nl.tudelft.ewi.st.atlantis.tudelft.v1.services", name = "exchCurrencyResponse")
    public JAXBElement<ExchCurrencyResponse> createExchCurrencyResponse(ExchCurrencyResponse value) {
        return new JAXBElement<ExchCurrencyResponse>(_ExchCurrencyResponse_QNAME, ExchCurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchCurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "nl.tudelft.ewi.st.atlantis.tudelft.v1.services", name = "exchCurrencyRequest")
    public JAXBElement<ExchCurrencyRequest> createExchCurrencyRequest(ExchCurrencyRequest value) {
        return new JAXBElement<ExchCurrencyRequest>(_ExchCurrencyRequest_QNAME, ExchCurrencyRequest.class, null, value);
    }

}
