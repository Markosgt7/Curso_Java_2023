package Clase_7;
import java.util.Scanner;
public class Ejemplo2Arrays {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("ingresa 5 numeros ");
        int contador = 0;
        while(contador < 5){
            numeros[contador]= contador;
            System.out.println(contador);
            contador++;
        }
    }
}
