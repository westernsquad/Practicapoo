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
public class MensajeActualizacion extends Mensaje {
		
	private string fecha;

	public MensajeCompra (int ID, string cliente, string empresa, string fecha) {
		super(ID, cliente, empresa);
		this.fecha = fecha;
	}

	public string getFecha() {
		return fecha;
	}
	
	public void setFecha(string fecha) {
		this.fecha = fecha;
	}

}
