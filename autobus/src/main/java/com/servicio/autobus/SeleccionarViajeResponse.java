//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.07 a las 12:57:01 PM CDT 
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
 *         &lt;element name="AsientosDisponibles" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "asientosDisponibles"
})
@XmlRootElement(name = "SeleccionarViajeResponse")
public class SeleccionarViajeResponse {

    @XmlElement(name = "AsientosDisponibles", required = true)
    protected String asientosDisponibles;

    /**
     * Obtiene el valor de la propiedad asientosDisponibles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsientosDisponibles() {
        return asientosDisponibles;
    }

    /**
     * Define el valor de la propiedad asientosDisponibles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsientosDisponibles(String value) {
        this.asientosDisponibles = value;
    }

}
