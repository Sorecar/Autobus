package com.servicio;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.servicio.autobus.CancelarBoletoRequest;
import com.servicio.autobus.CancelarBoletoResponse;
import com.servicio.autobus.ConsultarViajeRequest;
import com.servicio.autobus.ConsultarViajeResponse;
import com.servicio.autobus.ModificarBoletoRequest;
import com.servicio.autobus.ModificarBoletoResponse;
import com.servicio.autobus.SeleccionarAsientoRequest;
import com.servicio.autobus.SeleccionarAsientoResponse;
import com.servicio.autobus.SeleccionarViajeRequest;
import com.servicio.autobus.SeleccionarViajeResponse;
import com.servicio.autobus.VerBoletoRequest;
import com.servicio.autobus.VerBoletoResponse;



@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint {
	//Para la peticion de consultar viajes se requiere un origen, destino y una fecha
	//Como respuesta se devolvera el id de los viajes, hora y su precio
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "ConsultarViajeRequest")
	@ResponsePayload
	public ConsultarViajeResponse getConsultarViaje(@RequestPayload ConsultarViajeRequest peticion) {
		ConsultarViajeResponse respuesta = new ConsultarViajeResponse();
		respuesta.setIdViaje("idViaje: "+ "[idViaje]");
		respuesta.setHora(null);;
		respuesta.setPrecio(0);;
		return respuesta;
	}
	//Al seleeccionar un viaje se realiza una peticion donde manda el idViaje
	//Como respuesta tendremos los asientos disponibles en dicho viaje
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "SeleccionarViajeRequest")
	@ResponsePayload
	public SeleccionarViajeResponse getSeleccionarViaje(@RequestPayload SeleccionarViajeRequest peticion) {
		SeleccionarViajeResponse respuesta = new SeleccionarViajeResponse();
		respuesta.setAsientosDisponibles(0); //Se regresara de la base de datos el numero de asientos disponibles del viaje
		return respuesta;
	}
	//Al seleccionar el asiento, tambien se debe de asignar un nombre al pasajero
	//Como respuesta tendremos un boleto como tal con todos los elementos de un boleto como son:IdBoleto, Origen, Destino 
	//Fecha, Hora, Precio, Nombre del pasajero y el asiento seleccionado anteriormente
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "SeleccionarAsientoRequest")
	@ResponsePayload
	public SeleccionarAsientoResponse getSeleccionarAsiento(@RequestPayload SeleccionarAsientoRequest peticion) {
		SeleccionarAsientoResponse respuesta = new SeleccionarAsientoResponse();
		respuesta.setIdBoleto("IdBoleto:"+"[IdBoleto]");
		respuesta.setOrigen("Origen:" + "[Origen]");
		respuesta.setDestino("Destino"+"[Destion]");
		respuesta.setFecha(null);
		respuesta.setHora(null);
		respuesta.setPrecio(0);
		respuesta.setNomPasajero("Pasajero:"+"[NomPasajero]");
		respuesta.setAsiento(0);
		return respuesta;
	}
	//Para realizar esta peticion se pide el id del Boleto para podelo buscar en la BD
	//como respuesta tendremos todos los elementos de un boleto
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "VerBoletoRequest")
	@ResponsePayload
	public VerBoletoResponse getVerBoleto (@RequestPayload VerBoletoRequest peticion){
		VerBoletoResponse respuesta = new VerBoletoResponse();
		respuesta.setIdBoleto("IdBoleto:"+"[IdBoleto]");
		respuesta.setOrigen("Origen:" + "[Origen]");
		respuesta.setDestino("Destino"+"[Destion]");
		respuesta.setFecha("Fecha"+"[Fecha]");
		respuesta.setHora("Hora:"+"[Hora]");
		respuesta.setPrecio("Precio:"+"[Precio]");
		respuesta.setNomPasajero("Pasajero:"+"[NomPasajero]");
		respuesta.setAsiento("Asiento:"+"[Asiento]");
		return respuesta;
	}
	//Para modificar un boleto solo se podra cambiar el nombre del pasajero y/o el asiento para esto se pide el id del boleto  
	//Como respuesta regresamos los elementos del boleto ya modificado
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "ModificarBoletoRequest")
	@ResponsePayload
	public ModificarBoletoResponse getModificarBoleto (@RequestPayload ModificarBoletoRequest peticion) {
		ModificarBoletoResponse respuesta = new ModificarBoletoResponse();
		respuesta.setIdBoleto("IdBoleto:"+"[IdBoleto]");
		respuesta.setOrigen("Origen:" + "[Origen]");
		respuesta.setDestino("Destino"+"[Destion]");
		respuesta.setFecha(null);
		respuesta.setHora(null);
		respuesta.setPrecio(0);
		respuesta.setNomPasajero("Pasajero:"+"[NomPasajero]");
		respuesta.setAsiento(0);
		return respuesta;
	}
	//Para la cancelacion del boleto solo se requiere el id del boleto y automaticamente se eliminara dicho boleto y se realizaran
	// las modificacion en la base de datos
	//Como respuesta solo tendremos un mensaje el cual confirmara que se a cancelado el boleto
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "CancelarBoletoRequest")
	@ResponsePayload
	public CancelarBoletoResponse getCancelarBoleto (@RequestPayload CancelarBoletoRequest peticion) {
		CancelarBoletoResponse respuesta = new CancelarBoletoResponse();
		respuesta.setCheckOut("Boleto Cancelado Con Exito");
		return respuesta;
	}
}
