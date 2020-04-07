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
 *         &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomPasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Asiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idBoleto",
    "origen",
    "destino",
    "fecha",
    "hora",
    "precio",
    "nomPasajero",
    "asiento"
})
@XmlRootElement(name = "ModificarBoletoResponse")
public class ModificarBoletoResponse {

    @XmlElement(required = true)
    protected String idBoleto;
    @XmlElement(name = "Origen", required = true)
    protected String origen;
    @XmlElement(name = "Destino", required = true)
    protected String destino;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Hora", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hora;
    @XmlElement(name = "Precio")
    protected int precio;
    @XmlElement(name = "NomPasajero", required = true)
    protected String nomPasajero;
    @XmlElement(name = "Asiento")
    protected int asiento;

    /**
     * Obtiene el valor de la propiedad idBoleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBoleto() {
        return idBoleto;
    }

    /**
     * Define el valor de la propiedad idBoleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBoleto(String value) {
        this.idBoleto = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
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

    /**
     * Obtiene el valor de la propiedad nomPasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPasajero() {
        return nomPasajero;
    }

    /**
     * Define el valor de la propiedad nomPasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPasajero(String value) {
        this.nomPasajero = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     */
    public int getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     */
    public void setAsiento(int value) {
        this.asiento = value;
    }

}
