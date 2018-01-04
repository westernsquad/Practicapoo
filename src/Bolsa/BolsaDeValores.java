package POO.Bolsa;

import java.util.HashSet;

public class BolsaDeValores {
    
    private String nombreBolsa;
    private HashSet<Empresa> listaEmpresas; //he puesto hashset porque no se deberian de repetir las empresas
    //private Broker broker;
    
    public BolsaDeValores (String nombreBolsa) {
        this.nombreBolsa = nombreBolsa;
        listaEmpresas = new HashSet<Empresa> ();
    }
    
    public void añadirEmpresa (Empresa nuevaEmpresa) {
        listaEmpresas.add(nuevaEmpresa);
    }
    
    public void añadirEmpresa (String nombreEmpresa, double valorAccion, double valorPrevioActual, double valorIncremento) {
        Empresa e = new Empresa (nombreEmpresa, valorAccion, valorPrevioActual, valorIncremento);
        añadirEmpresa(e);
    }

    public void eliminarEmpresa (Empresa e) throws BolsaException {   
        if (listaEmpresas.isEmpty()) {
            throw new BolsaException (BolsaException.EX_BOLSA_EMPTY);
        } else if (listaEmpresas.contains(e)) {
          listaEmpresas.remove(e);  
        } else {
            throw new BolsaException (BolsaException.EX_EMPRESA_NOT_FOUND);
        }      
    }
    
    public void eliminarEmpresa (String nombreEmpresa) throws BolsaException {
        Empresa borrarEmpresa = null;
        if (listaEmpresas.isEmpty()) {
                throw new BolsaException (BolsaException.EX_BOLSA_EMPTY);
        }
        
        for (Empresa e : listaEmpresas) {    
            if (e.getNombreEmpresa().equals(nombreEmpresa)) {
                borrarEmpresa = e;
            } 
        }
        if (borrarEmpresa != null) {
            eliminarEmpresa (borrarEmpresa);
        } else {
            throw new BolsaException (BolsaException.EX_EMPRESA_NOT_FOUND);
        }
    }
              
    public void mostrarListaBolsa() {
        for (Empresa l : listaEmpresas) {
            System.out.println(l.getNombreEmpresa());
            System.out.println(l.getValorAccion());
            System.out.println(l.getValorIncremento());
        }
    }
    
    
}
