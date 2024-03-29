//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.08 at 12:35:06 PM GMT 
//


package generatedProcess;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _SerieTitle_QNAME = new QName("", "serieTitle");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _EpFeat_QNAME = new QName("", "epFeat");
    private final static QName _Eps_QNAME = new QName("", "eps");
    private final static QName _ProcAtor_QNAME = new QName("", "procAtor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link ACatalog }
     * 
     */
    public ACatalog createACatalog() {
        return new ACatalog();
    }

    /**
     * Create an instance of {@link PopActor }
     * 
     */
    public PopActor createPopActor() {
        return new PopActor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "serieTitle")
    public JAXBElement<String> createSerieTitle(String value) {
        return new JAXBElement<String>(_SerieTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "epFeat")
    public JAXBElement<BigInteger> createEpFeat(BigInteger value) {
        return new JAXBElement<BigInteger>(_EpFeat_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "eps")
    public JAXBElement<BigInteger> createEps(BigInteger value) {
        return new JAXBElement<BigInteger>(_Eps_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "procAtor")
    public JAXBElement<BigInteger> createProcAtor(BigInteger value) {
        return new JAXBElement<BigInteger>(_ProcAtor_QNAME, BigInteger.class, null, value);
    }

}
