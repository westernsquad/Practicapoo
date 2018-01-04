package POO.General;


public class InterfazDeUsuario {
    
    int opcion;
    
    public void imprimirMenu() {
        System.out.println("0. Salir");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        
        Escaner.leerPorPantalla(opcion);
    }
    
}
