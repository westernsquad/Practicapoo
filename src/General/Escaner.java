package POO.General;


public class Escaner {
    
    public static void leerPorPantalla (int opcion) {
        boolean salir = false;
        
        while (!salir) {
            switch (opcion) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;    
            }
        }   
    }      
    
}
