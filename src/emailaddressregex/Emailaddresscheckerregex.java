package emailaddressregex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Arnaldo Benavides, Donny Escolar, Victor Medina
 */
public class Emailaddresscheckerregex {
    public static void main(String[] args) {
        System.out.println("*******************************************************************************");
        System.out.println("************************ EMAIL ADDRESS CHECKER ********************************");
        System.out.println("*******************************************************************************\n");
        //Leemos la cadena a comprobar por teclado
        System.out.print("Digite la cadena a comprobar: ");
        Scanner read = new Scanner(System.in);
        String cadena = read.nextLine();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Cadena ingresada: " + cadena);
        //Definimos el patron que vamos a buscar en la cadena, en este caso, una direccion de correo electronico 
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_\\.\\-]+@[a-zA-Z0-9\\-_]+(\\.[a-zA-Z0-9\\-_]+)?$");
        //Usamos el metodo matcher para devolver un objeto de tipo Matcher que tendra todas las coincidencias del patron
        Matcher matcher = pattern.matcher(cadena);
        //Recorremos la cadena ingresada en busca del patron
        boolean matchFound = matcher.find();
        //Escribimos el resultado dependiendo de si el comprobador encuentra coincidencias con el patron
        if(matchFound) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Resultado: La direccion de correo electronico es VALIDA");
            System.out.println("-------------------------------------------------------------------------------");
        } else {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Resultado: La direccion de correo electronico es INVALIDA");
            System.out.println("-------------------------------------------------------------------------------");
        }
    } 
}
