//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.07 a las 04:10:13 PM CDT 
//


package com.servicio.autobus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idViaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idViaje",
    "hora",
    "precio"
})
@XmlRootElement(name = "ConsultarViajeResponse")
public class ConsultarViajeResponse {

    @XmlElement(required = true)
    protected String idViaje;
    @XmlElement(name = "Hora", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hora;
    @XmlElement(name = "Precio")
    protected int precio;

    /**
     * Obtiene el valor de la propiedad idViaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdViaje() {
        return idViaje;
    }

    /**
     * Define el valor de la propiedad idViaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdViaje(String value) {
        this.idViaje = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHora(XMLGregorianCalendar value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(int value) {
        this.precio = value;
    }

}
