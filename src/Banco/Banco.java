/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author guill
 */
public class Banco {
    private Cliente cliente;
    private ClientePremium clienteP;
    private final ArrayList<Cliente> bancoCli;
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
 
 public void mejorar1(String Nombre){
     
 }
  public void mejorar (String nombre){
      for (Iterator it = bancoCli.iterator();it.hasNext();){
          Cliente cl = (Cliente) it.next();
          if (nombre.equals(cl.getNombre())) {
              
          }
         
      }
  }
      
      
  public void comprobarPremium (String nombre){
      
       Cliente cli = comprobar(nombre);
      if (cli.isPremium()){
          System.out.println("Ya es un cliente premium");
      }else {
          cli.setPremium(true);
          System.out.println("ahora" + cli.getNombre() + "es cliente premium");
      }
  }
  
  
  public void copiaSeguridad (String fichero){
      try(FileOutputStream fileOutputStream = new FileOutputStream(fichero);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	  ){
            objectOutputStream.writeObject(this.bancoCli);
        } catch(Exception ex){
            System.out.println("Error serializando");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }                      
 }
  public void deserializa(String fichero){ //leer binario
        try(
                InputStream file = new FileInputStream(fichero);
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream(buffer);
            ) {
            Banco bancoDeserializadas = (Banco) input.readObject();
            input.close();
        } catch (ClassNotFoundException ex){
            System.out.println("Error deserializando (class not found)");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error deserializando (IO)");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println("Error deserializando (otros)");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
        }
    }
  
 
  // fic = new FileWriter(numero);
   // buff = new BufferedWriter(fic);
   // salida=new PrintWriter(buff);
}
 
  // fic = new FileWriter(numero);
   // buff = new BufferedWriter(fic);
   // salida=new PrintWriter(buff);
}