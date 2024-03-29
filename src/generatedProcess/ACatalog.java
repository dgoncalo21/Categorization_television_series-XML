//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.08 at 12:35:06 PM GMT 
//

package generatedProcess;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}actor" maxOccurs="unbounded"/>
 *         &lt;element ref="{}procAtor"/>
 *         &lt;element ref="{}popActor" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "actor", "procAtor", "popActor" })
@XmlRootElement(name = "aCatalog")
public class ACatalog
{

	@XmlElement(required = true)
	protected List<Actor> actor;
	@XmlElement(required = true)
	protected BigInteger procAtor;
	@XmlElement(required = true)
	protected List<PopActor> popActor;

	/**
	 * Gets the value of the actor property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the actor property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getActor().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Actor }
	 * 
	 * 
	 */
	public List<Actor> getActor()
	{
		if (actor == null)
		{
			actor = new ArrayList<Actor>();
		}
		return this.actor;
	}

	public void setActor(List<Actor> actores)
	{
		actor = actores;
	}

	/**
	 * Gets the value of the procAtor property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getProcAtor()
	{
		return procAtor;
	}

	/**
	 * Sets the value of the procAtor property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setProcAtor(BigInteger value)
	{
		this.procAtor = value;
	}

	/**
	 * Gets the value of the popActor property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the popActor property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPopActor().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PopActor }
	 * 
	 * 
	 */
	public List<PopActor> getPopActor()
	{
		if (popActor == null)
		{
			popActor = new ArrayList<PopActor>();
		}
		return this.popActor;
	}

	public void setListPopActor(List<PopActor> pop)
	{
		popActor = pop;
	}
}
