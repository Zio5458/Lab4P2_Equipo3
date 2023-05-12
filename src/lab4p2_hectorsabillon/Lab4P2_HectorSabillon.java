
package lab4p2_hectorsabillon;

import java.util.Scanner;


public class Lab4P2_HectorSabillon {

    
    public static void main(String[] args) {
        Scanner pochita = new Scanner(System.in);
        int opc = 0;
        while (opc != 3) {            
            System.out.print("---Inicio---\n\n1.Iniciar Sesion\n2.Crear Usuario\n3.Salir\nElegir una opcion: ");
            opc = pochita.nextInt();
            switch (opc) {
                case 1:
                    
                    break;
                    //fin opc 1
                case 2:
                    break;
                    // fin opc 2
                case 3:
                    //fin opc 3
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
}
