/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author guill
 */
public class Banco {
    private Cliente cliente;
    private ClientePremium clienteP;
    private ArrayList<Cliente> bancoCli;
   // FileWriter fic =null;
   // BufferedWriter buff =null;
    //PrintWriter salida = null;
    

 public Banco () {
    bancoCli = new ArrayList();
}
public int consultar (String numero){
  
for (Iterator it = bancoCli.iterator();it.hasNext();){
   Cliente cl = (Cliente) it.next();
   
   if (cl.getDNI().equals(numero)) {
       return 1; }
  }
  return 0; 
 }
public Cliente comprobar (String nombre){
  boolean encontrado;
  Cliente cp = null;
for (Iterator it = bancoCli.iterator();it.hasNext();){
   Cliente cl = (Cliente) it.next();
   if (cl.getNombre().equals(nombre)) {
       encontrado =true;
       cp=cl;
       
   }
  }
    if (encontrado = true){
        return cp;
    }else{
            return null;
    }
 }
 
 public Banco add (Cliente cliente){
     
          if(consultar(cliente.getDNI())==0){
              System.out.println("Este cliente ya esta en el banco");
          } else {
               bancoCli.add(cliente);
                return this;
          }
     
  return this;
 }
 
 public Banco remove (String dni){
     if(consultar(dni)==1){
        bancoCli.remove(cliente);
        return this;
     }else{
         return this;
     }
     
 }
 
 public void mejorar (String Nombre){
     
 }
 
  // fic = new FileWriter(numero);
   // buff = new BufferedWriter(fic);
   // salida=new PrintWriter(buff);
}