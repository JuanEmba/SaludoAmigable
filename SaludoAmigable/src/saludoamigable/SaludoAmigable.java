package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable {
    static String nombre;
    Scanner stdIn = new Scanner(System.in);
    
    
    public void entrada (){
        System.out.print("Introduce tu nombre: ");
        nombre = stdIn.nextLine();
    }

    
    public static void main(String[] args) {

        
        SaludoAmigable saludo = new SaludoAmigable();
        saludo.entrada();
        System.out.println("¡Hola " + nombre + "!");

    }

}
