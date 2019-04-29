
package org.docx4j.com.microsoft.schemas.office.drawing.x2010.main;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.opendope.SmartArt.dataHierarchy.Child;


/**
 * <p>Java class for CT_PictureEffectColorTemperature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PictureEffectColorTemperature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="colorTemp" type="{http://schemas.microsoft.com/office/drawing/2010/main}ST_ColorTemperature" default="6500" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PictureEffectColorTemperature")
public class CTPictureEffectColorTemperature implements Child
{

    @XmlAttribute(name = "colorTemp")
    protected Integer colorTemp;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the colorTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getColorTemp() {
        if (colorTemp == null) {
            return  6500;
        } else {
            return colorTemp;
        }
    }

    /**
     * Sets the value of the colorTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColorTemp(Integer value) {
        this.colorTemp = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
