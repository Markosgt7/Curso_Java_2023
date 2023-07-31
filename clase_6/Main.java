package clase_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //ejercicio edad de perro
        Scanner teclado = new Scanner(System.in);
        int edadPerro;
        int AniosPerrunos;
        System.out.println("Ingrese la edad de su perro");
        edadPerro = teclado.nextInt();
        AniosPerrunos = edadPerro *7;
        System.out.println("La edad de tu perro es de:->"+ AniosPerrunos +" años perrunos");

    }
}
