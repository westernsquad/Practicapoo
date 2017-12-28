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
public class ClientePremium extends Cliente {
    private AgenteDeInversiones agente;

    public ClientePremium(AgenteDeInversiones agente, String nombre, String DNI, boolean tipo) {
        super(nombre, DNI, tipo);
        this.agente = agente;
    }

    public AgenteDeInversiones getAgente() {
        return agente;
    }

    public void setAgente(AgenteDeInversiones agente) {
        this.agente = agente;
    }
    

}
