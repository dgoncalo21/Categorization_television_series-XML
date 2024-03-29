//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.27 at 05:22:33 PM GMT 
//


package generatedSelec;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}genre"/>
 *         &lt;element ref="{}rating" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}firstEp" minOccurs="0"/>
 *         &lt;element ref="{}lastEp" minOccurs="0"/>
 *         &lt;element ref="{}song" minOccurs="0"/>
 *         &lt;element ref="{}network" minOccurs="0"/>
 *         &lt;element ref="{}writer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}director" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}creator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}episode" maxOccurs="unbounded"/>
 *         &lt;element ref="{}availableOn" maxOccurs="unbounded"/>
 *         &lt;element ref="{}profile" maxOccurs="unbounded"/>
 *         &lt;element ref="{}actor" maxOccurs="unbounded"/>
 *         &lt;element ref="{}search" maxOccurs="unbounded"/>
 *         &lt;element ref="{}nEps"/>
 *         &lt;element ref="{}nSeasons"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "genre",
    "rating",
    "description",
    "firstEp",
    "lastEp",
    "song",
    "network",
    "writer",
    "director",
    "creator",
    "episode",
    "availableOn",
    "profile",
    "actor",
    "search",
    "nEps",
    "nSeasons"
})
@XmlRootElement(name = "serie")
public class Serie {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String genre;
    @XmlElement(required = true)
    protected List<Rating> rating;
    @XmlElement(required = true)
    protected String description;
    protected XMLGregorianCalendar firstEp;
    protected XMLGregorianCalendar lastEp;
    protected String song;
    protected String network;
    protected List<String> writer;
    protected List<String> director;
    protected List<String> creator;
    @XmlElement(required = true)
    protected List<Episode> episode;
    @XmlElement(required = true)
    protected List<AvailableOn> availableOn;
    @XmlElement(required = true)
    protected List<Profile> profile;
    @XmlElement(required = true)
    protected List<Actor> actor;
    @XmlElement(required = true)
    protected List<Search> search;
    @XmlElement(required = true)
    protected BigInteger nEps;
    @XmlElement(required = true)
    protected BigInteger nSeasons;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rating }
     * 
     * 
     */
    public List<Rating> getRating() {
        if (rating == null) {
            rating = new ArrayList<Rating>();
        }
        return this.rating;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the firstEp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstEp() {
        return firstEp;
    }

    /**
     * Sets the value of the firstEp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstEp(XMLGregorianCalendar value) {
        this.firstEp = value;
    }

    /**
     * Gets the value of the lastEp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastEp() {
        return lastEp;
    }

    /**
     * Sets the value of the lastEp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastEp(XMLGregorianCalendar value) {
        this.lastEp = value;
    }

    /**
     * Gets the value of the song property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSong() {
        return song;
    }

    /**
     * Sets the value of the song property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSong(String value) {
        this.song = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the writer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the writer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWriter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWriter() {
        if (writer == null) {
            writer = new ArrayList<String>();
        }
        return this.writer;
    }

    /**
     * Gets the value of the director property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the director property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDirector() {
        if (director == null) {
            director = new ArrayList<String>();
        }
        return this.director;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCreator() {
        if (creator == null) {
            creator = new ArrayList<String>();
        }
        return this.creator;
    }

    /**
     * Gets the value of the episode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the episode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEpisode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Episode }
     * 
     * 
     */
    public List<Episode> getEpisode() {
        if (episode == null) {
            episode = new ArrayList<Episode>();
        }
        return this.episode;
    }

    /**
     * Gets the value of the availableOn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableOn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableOn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableOn }
     * 
     * 
     */
    public List<AvailableOn> getAvailableOn() {
        if (availableOn == null) {
            availableOn = new ArrayList<AvailableOn>();
        }
        return this.availableOn;
    }

    /**
     * Gets the value of the profile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Profile }
     * 
     * 
     */
    public List<Profile> getProfile() {
        if (profile == null) {
            profile = new ArrayList<Profile>();
        }
        return this.profile;
    }

    /**
     * Gets the value of the actor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actor }
     * 
     * 
     */
    public List<Actor> getActor() {
        if (actor == null) {
            actor = new ArrayList<Actor>();
        }
        return this.actor;
    }

    /**
     * Gets the value of the search property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the search property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Search }
     * 
     * 
     */
    public List<Search> getSearch() {
        if (search == null) {
            search = new ArrayList<Search>();
        }
        return this.search;
    }

    /**
     * Gets the value of the nEps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNEps() {
        return nEps;
    }

    /**
     * Sets the value of the nEps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNEps(BigInteger value) {
        this.nEps = value;
    }

    /**
     * Gets the value of the nSeasons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNSeasons() {
        return nSeasons;
    }

    /**
     * Sets the value of the nSeasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNSeasons(BigInteger value) {
        this.nSeasons = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
