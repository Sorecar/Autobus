package com.servicio;

import Controlador.AsientoController;
import Controlador.BoletoController;
import Controlador.ViajeController;
import Modelo.Asiento;
import Modelo.Boleto;
import Modelo.Viaje;
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
import java.util.ArrayList;

@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint {
	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "ConsultarViajeRequest")

	@ResponsePayload
	public ConsultarViajeResponse getConsultarViaje(@RequestPayload ConsultarViajeRequest peticion) {
		ConsultarViajeResponse respuesta = new ConsultarViajeResponse();

		ViajeController vc = new ViajeController();
		ArrayList<Viaje> li = vc.consultaViaje(peticion.getOrigen(), peticion.getDestino(), peticion.getFecha());
		ArrayList<ConsultarViajeResponse.Viaje> lr = new ArrayList<ConsultarViajeResponse.Viaje>();

		if (li.size() != 0) {
			for (Viaje v : li) {
				ConsultarViajeResponse.Viaje temp = new ConsultarViajeResponse.Viaje();
				temp.setHora(v.getHora());
				temp.setPrecio(v.getPrecio());
				lr.add(temp);
			}
			respuesta.getViaje().addAll(lr);
			return respuesta;
		} else {
			respuesta.setMensaje("Error en la busqueda de viajes");
			return respuesta;
		}

	}

	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "SeleccionarViajeRequest")
	@ResponsePayload
	public SeleccionarViajeResponse getSeleccionarViaje(@RequestPayload SeleccionarViajeRequest peticion) {
		SeleccionarViajeResponse respuesta = new SeleccionarViajeResponse();

		AsientoController ac = new AsientoController();
		ArrayList<Asiento> li = ac.consultarAsientos(peticion.getIdViaje());
		ArrayList<SeleccionarViajeResponse.AsientosDisponibles> lr = new ArrayList<SeleccionarViajeResponse.AsientosDisponibles>();

		if (li.size() != 0) {
			for (Asiento a : li) {
				SeleccionarViajeResponse.AsientosDisponibles temp = new SeleccionarViajeResponse.AsientosDisponibles();
				temp.setIdAsiento(a.getIdViaje());
				lr.add(temp);
			}
			respuesta.getAsientosDisponibles().addAll(lr);
			return respuesta;
		} else {
			respuesta.setMensaje("Error en la busqueda de asientos");
			return respuesta;
		}
	}

	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "SeleccionarAsientoRequest")
	@ResponsePayload
	public SeleccionarAsientoResponse getSeleccionarAsiento(@RequestPayload SeleccionarAsientoRequest peticion) {
		SeleccionarAsientoResponse respuesta = new SeleccionarAsientoResponse();

		BoletoController bc = new BoletoController();
		Boleto boleto = bc.crearBoleto(peticion.getIdViaje(), peticion.getIdasiento(), peticion.getPasajero());

		if (boleto != null) {
			respuesta.getBoleto().setIdBoleto(boleto.getIdBoleto());
			respuesta.getBoleto().setOrigen(boleto.getDestino());
			respuesta.getBoleto().setFecha(boleto.getFecha());
			respuesta.getBoleto().setHora(boleto.getHora());
			respuesta.getBoleto().setPrecio(boleto.getPrecio());
			respuesta.getBoleto().setPasajero(boleto.getPasajero());
			respuesta.getBoleto().setAsiento(boleto.getAsiento());
			return respuesta;
		} else {
			respuesta.setMensaje("Error en la compra");
			return respuesta;
		}
	}

	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "VerBoletoRequest")
	@ResponsePayload
	public VerBoletoResponse getVerBoleto(@RequestPayload VerBoletoRequest peticion) {
		VerBoletoResponse respuesta = new VerBoletoResponse();

		BoletoController bc = new BoletoController();
		Boleto boleto = bc.verBoleto(peticion.getIdBoleto());
		if (boleto != null) {
			respuesta.getBoleto().setIdBoleto(boleto.getIdBoleto());
			respuesta.getBoleto().setOrigen(boleto.getDestino());
			respuesta.getBoleto().setFecha(boleto.getFecha());
			respuesta.getBoleto().setHora(boleto.getHora());
			respuesta.getBoleto().setPrecio(boleto.getPrecio());
			respuesta.getBoleto().setPasajero(boleto.getPasajero());
			respuesta.getBoleto().setAsiento(boleto.getAsiento());
			return respuesta;
		} else {
			respuesta.setMensaje("Error, El boleto no existe");
			return respuesta;
		}
	}

	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "ModificarBoletoRequest")
	@ResponsePayload
	public ModificarBoletoResponse getModificarBoleto(@RequestPayload ModificarBoletoRequest peticion) {
		ModificarBoletoResponse respuesta = new ModificarBoletoResponse();

		BoletoController bc = new BoletoController();
		if (bc.modificarBoleto(peticion.getIdBoleto(), peticion.getAsiento(), peticion.getPasajero())) {
			respuesta.setMensaje("Boleto modificado con exito");
			return respuesta;
		} else {
			respuesta.setMensaje("Error en la modificacion del boleto");
			return respuesta;
		}
	}

	@PayloadRoot(namespace = "http://www.servicio.com/autobus", localPart = "CancelarBoletoRequest")
	@ResponsePayload
	public CancelarBoletoResponse getCancelarBoleto(@RequestPayload CancelarBoletoRequest peticion) {
		CancelarBoletoResponse respuesta = new CancelarBoletoResponse();

		BoletoController bc = new BoletoController();
		if (bc.cancelarBoleto(peticion.getIdBoleto(), peticion.getAsiento())) {
			respuesta.setMensaje("Boleto cancelado con exito");
			return respuesta;
		} else {
			respuesta.setMensaje("Error en la cancelacion del boleto");
			return respuesta;
		}
	}
}
