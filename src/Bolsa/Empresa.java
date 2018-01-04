package POO.Bolsa;


public class Empresa {
    
    private String nombreEmpresa;
    private double valorAccion;
    private double valorPrevioActual;
    private double valorIncremento;
    
    public Empresa (String nombreEmpresa, double valorAccion, double valorPrevioActual, double valorIncremento) {
        this.nombreEmpresa = nombreEmpresa;
        this.valorAccion = valorAccion;
        this.valorPrevioActual = valorPrevioActual;
        this.valorIncremento = valorIncremento;
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public double getValorAccion() {
        return valorAccion;
    }
    
    public double getValorPrevioActual() {
        return valorPrevioActual;
    }
    
    public double getValorIncremento() {
        return valorIncremento;
    }
    
    public void actualizarValorPrevio() {
        this.valorPrevioActual = Math.random();
    }
    
    public void actualizarIncremento() {
        this.valorIncremento = Math.random();
    }
    
}
    
