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
public class Cliente extends Persona {
    
    private int saldo;
    private ArrayList <PaqueteDeAcciones> CarteraAcciones;
    private boolean Premium = false ;

    public Cliente(String nombre, String DNI, boolean tipo) {
        super(nombre, DNI, tipo);
    }
    
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<PaqueteDeAcciones> getCarteraAcciones() {
        return CarteraAcciones;
    }
    public void setCarteraAcciones(ArrayList<PaqueteDeAcciones> CarteraAcciones) {
        this.CarteraAcciones = CarteraAcciones;
    }

    @Override
    public String toString() {
        return "Cliente{" + "saldo=" + saldo + ", CarteraAcciones=" + CarteraAcciones +'}';
    }
    
}
