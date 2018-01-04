/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensajes;

import java.util.ArrayList;

/**
 *
 * @author dlahera
 */
public class MensajeCompra extends Mensaje {
   	private double cantidadMaxima;

   	public MensajeCompra (int ID, string cliente, string empresa, double cantidadMaxima) {
       		super(ID, Cliente, Empresa);
       		this.cantidadMaxima = cantidadMaxima;
    	}
	
	public double getCantidadMaxima() {
		return cantidadMaxima;
	}
	
	public void setcantidadMaxima(double cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

}
