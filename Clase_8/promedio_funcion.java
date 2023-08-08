package Clase_8;
import java.util.Scanner;

public class promedio_funcion {
    public  static  void main(String[] args){
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingresa su primer nota");
        float nota1= tc.nextFloat();
        System.out.println("Ingresa su segunda nota");
        float nota2= tc.nextFloat();
        System.out.println("Ingresa su tercer nota");
        float nota3= tc.nextFloat();

        float promedio = (nota1+nota2+nota3)/3;

        System.out.println("el promedio es:->"+ promedio);








    }
}
