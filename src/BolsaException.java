package POO.Bolsa;


public class BolsaException extends Exception {
    
    public static final String EX_BOLSA_EMPTY = "Bolsa de Valores vacia";
    public static final String EX_EMPRESA_NOT_FOUND = "Empresa no encontrada";
       
    public BolsaException() {
    }

    public BolsaException (String message) {
        super(message);
    }
 
    public BolsaException (String message, Throwable throwable) {
        super(message, throwable);
    }
    
    public BolsaException (Throwable throwable) {
        super(throwable);
    }
           
}


