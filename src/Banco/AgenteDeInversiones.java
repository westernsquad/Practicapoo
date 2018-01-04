/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.ArrayList;

/**
 *
 * @author guill y dlahera
 */
public class AgenteDeInversiones extends Persona{

    	private ArrayList<Mensaje> operPendientes;
    	private ArrayList<Mensaje> resultadoOper;

    	public AgenteDeInversiones(String nombre, String DNI, boolean tipo) {
        	super(nombre, DNI, tipo);
		this.operPendientes = new ArrayList<Mensaje>();
		this.resultadoOper = new ArrayList<Mensaje>();
    	}

	public void añadirMensaje(Mensaje nuevoMensaje) {
        	operPendientes.add(nuevoMensaje);
		
   	}
    	
	public void solicitarCompra (string cliente, string empresa, double cantidadMaxima) {
		mensaje mc = new Mensaje (cliente, empresa, cantidadMaxima)
		if (bancoCli.nombre.!contains(mc.cliente)) {
			throw new MensajeException (MensajeException.EX_CLIENTE_NOT_FOUND);
		} else if {m.cantidadMaxima<getValorAccion(mc.empresa) {
			throw new MensajeException (MensajeException.EX_NOT_ENOUGH_DINERO);
		}else {
			añadirMensaje(m);
		}
	}
	
	public void solicitarVenta (string cliente, string empresa, int cantidadAcciones) {
		mensaje mv = new Mensaje (cliente, empresa, cantidadAcciones)
		if (bancoCli.nombre.!contains(mv.cliente)) {
			throw new MensajeException (MensajeException.EX_CLIENTE_NOT_FOUND);
		} else if {m.cantidadAcciones>getNumTitulos(mv.cliente) {                     //Cuando se termine la clase PaqueteDeAcciones se termina esto (nºtitulos a vender> nºtitulos que posee de esa empresa)
			throw new MensajeException (MensajeException.EX_NOT_ENOUGH_ACCIONES);
		}else {
			añadirMensaje(m);
		}
	}
		
	public void solicitarActualizacion (string cliente, string empresa, string fecha) {
		mensaje ma = new Mensaje (cliente, empresa)
		if (bancoCli.nombre.!contains(mc.cliente)) {
			throw new MensajeException (MensajeException.EX_CLIENTE_NOT_FOUND);
		}else {
			añadirMensaje(m);
		}
	// falta la fecha
	}	

}
