//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.09 a las 04:03:08 PM CDT 
//


package com.servicio.autobus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="idBoleto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pasajero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pasajero",
    "asiento"
})
@XmlRootElement(name = "ModificarBoletoRequest")
public class ModificarBoletoRequest {

    protected int idBoleto;
    @XmlElement(required = true)
    protected String pasajero;
    protected int asiento;

    /**
     * Obtiene el valor de la propiedad idBoleto.
     * 
     */
    public int getIdBoleto() {
        return idBoleto;
    }

    /**
     * Define el valor de la propiedad idBoleto.
     * 
     */
    public void setIdBoleto(int value) {
        this.idBoleto = value;
    }

    /**
     * Obtiene el valor de la propiedad pasajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasajero() {
        return pasajero;
    }

    /**
     * Define el valor de la propiedad pasajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasajero(String value) {
        this.pasajero = value;
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
