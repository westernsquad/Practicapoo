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
public class MensajeVenta extends Mensaje {
		
	private int cantidadAcciones;

	public MensajeVenta (int ID, string cliente, string empresa, int cantidadAcciones) {
		super(ID, cliente, empresa);
		this.cantidadAcciones = cantidadAcciones;
	}

	public int getCantidadAcciones() {
		return cantidadAcciones;
	}
	
	public void setCantidadAcciones(int cantidadAcciones) {
		this.cantidadAcciones = cantidadAcciones;
	}

}
