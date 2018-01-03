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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<PaqueteDeAcciones> acciones = null;
        Cliente cliente ;
        Banco banco = new Banco();
        cliente = new Cliente(1000,acciones,"luis","012548967X",false);
        Cliente cliente2 = new Cliente(1500,acciones,"maria","012548969X",false);
        banco.add(cliente);
        banco.add(cliente2);
        System.out.println(banco.mostrar());
        banco.remove(cliente);
        banco.comprobarPremium(cliente);
        banco.copiaSeguridad("copia.ser");
        banco.deserializa("copia.ser");
        
        
}
    
}