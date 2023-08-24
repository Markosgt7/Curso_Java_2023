package Clase_8;
import java.util.Scanner;
public class calculaEdad {
    public static  void main(String[] args){
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese el año que nació");
        int anio = tc.nextInt();
        System.out.println("Escriba el año en el que estamos");
        int anioActual = tc.nextInt();
        int edad = anioActual - anio;
        System.out.printf("tienes  "+ edad+" años");

    }
}
