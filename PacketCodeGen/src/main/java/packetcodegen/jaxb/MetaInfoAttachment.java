//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.31 at 08:51:19 PM EDT 
//


package packetcodegen.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaInfoAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaInfoAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{}MetaInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInfoAttachment", propOrder = {
    "info"
})
@XmlSeeAlso({
    FieldType.class,
    PacketType.class
})
public class MetaInfoAttachment {

    @XmlElement(name = "Info")
    protected MetaInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link MetaInfo }
     *     
     */
    public MetaInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInfo }
     *     
     */
    public void setInfo(MetaInfo value) {
        this.info = value;
    }

}
