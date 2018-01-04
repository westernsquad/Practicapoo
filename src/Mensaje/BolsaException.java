/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import java.util.ArrayList;

/**
 *
 * @author dlahera
 */
 public class MensajeException extends Exception {
    
	public static final String EX_CLIENTE_NOT_FOUND = "Cliente no encontrado";
	public static final String EX_NOT_ENOUGH_DINERO = "No se tiene dinero suficiente";
	public static final String EX_NOT_ENOUGH_ACCIONES = "No se tienen acciones suficientes";
       
    	public BolsaException() {
    	}

    	public BolsaException (String message) {
       		super(message);
    	}
 
    	public BolsaException (String message, Throwable throwable) {
        	super(message, throwable);
    	}
    
	public BolsaException (Throwable throwable) {
        	super(throwable);
    	}
      
}
