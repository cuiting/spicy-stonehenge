
package services.v1.tudelft.atlantis.st.ewi.tudelft.nl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.ebayopensource.turmeric.common.v1.types.BaseRequest;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for ExchCurrencyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchCurrencyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="baseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="termtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchCurrencyRequest", propOrder = {
    "baseType",
    "termtype",
    "exchAmount"
})
public class ExchCurrencyRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String baseType;
    @XmlElement(required = true)
    protected String termtype;
    protected int exchAmount;

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the termtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermtype() {
        return termtype;
    }

    /**
     * Sets the value of the termtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermtype(String value) {
        this.termtype = value;
    }

    /**
     * Gets the value of the exchAmount property.
     * 
     */
    public int getExchAmount() {
        return exchAmount;
    }

    /**
     * Sets the value of the exchAmount property.
     * 
     */
    public void setExchAmount(int value) {
        this.exchAmount = value;
    }

}
