//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.09 a las 04:03:08 PM CDT 
//


package com.servicio.autobus;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="asientosDisponibles" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "asientosDisponibles",
    "mensaje"
})
@XmlRootElement(name = "SeleccionarViajeResponse")
public class SeleccionarViajeResponse {

    @XmlElement(required = true)
    protected List<SeleccionarViajeResponse.AsientosDisponibles> asientosDisponibles;
    @XmlElement(required = true)
    protected String mensaje;

    /**
     * Gets the value of the asientosDisponibles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asientosDisponibles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsientosDisponibles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeleccionarViajeResponse.AsientosDisponibles }
     * 
     * 
     */
    public List<SeleccionarViajeResponse.AsientosDisponibles> getAsientosDisponibles() {
        if (asientosDisponibles == null) {
            asientosDisponibles = new ArrayList<SeleccionarViajeResponse.AsientosDisponibles>();
        }
        return this.asientosDisponibles;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }


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
     *         &lt;element name="idAsiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idAsiento"
    })
    public static class AsientosDisponibles {

        @XmlElement(required = true)
        protected String idAsiento;

        /**
         * Obtiene el valor de la propiedad idAsiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdAsiento() {
            return idAsiento;
        }

        /**
         * Define el valor de la propiedad idAsiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdAsiento(String value) {
            this.idAsiento = value;
        }

    }

}
