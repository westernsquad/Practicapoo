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
public class Mensaje {
    
    private int ID;
	private string cliente;
	private string empresa;

	public Mensaje (int ID, string cliente, string empresa) {
		this.ID = ID;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

	public string getCliente() {
		return cliente;
	}
	
	public void setCliente(string cliente) {
		this.cliente = cliente;
	}

	public string getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(string Empresa) {
		this.empresa = empresa;
	}

}
