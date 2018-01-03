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

    public Cliente(int saldo, ArrayList<PaqueteDeAcciones> CarteraAcciones, String nombre, String DNI, boolean tipo) {
        super(nombre, DNI, tipo);
        this.saldo = saldo;
        this.CarteraAcciones = CarteraAcciones;
    }

    

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean Premium) {
        this.Premium = Premium;
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
