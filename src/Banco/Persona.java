/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.ArrayList;

/**
 *
 * @author guill
 */
public class Persona {
    private String nombre;
    private String DNI;
    private boolean tipo;//true cliente y false=agente

    public Persona(String nombre, String DNI, boolean tipo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.tipo = tipo;
    }
  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DNI=" + DNI + ", tipo=" + tipo + '}';
    }
    
   
    
}
