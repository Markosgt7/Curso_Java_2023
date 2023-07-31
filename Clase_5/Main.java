package Clase_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner cargarDatos = new Scanner(System.in);
       String nombre = "Marcos";
       int edad = cargarDatos.nextInt();
       if(edad >= 18){
           System.out.println(nombre + "Eres mayor de edad");
       }else{
           System.out.println(nombre + "Eres menor de edad");
       }

    }
}
