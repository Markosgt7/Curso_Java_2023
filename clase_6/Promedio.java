package clase_6;
import java.util.Scanner;
public class Promedio {
    public static void main(String [] args){
       Scanner kb = new Scanner(System.in);

        System.out.println("Escribe tu primer nota");
        float nota_1 = kb.nextFloat();
        System.out.println("Escribe tu segunda nota");
        float nota_2 = kb.nextFloat();
        System.out.println("Escribe tu tercer nota");
        float nota_3 = kb.nextFloat();

        float promedio = (nota_1 + nota_2 + nota_3) / 3;

        System.out.println("El promedio es:->"+ promedio);



    }
}
