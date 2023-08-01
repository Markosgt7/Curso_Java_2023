package Clase_8;
import java.util.Scanner;
public class ejemploDos {
    public  static void main(String[] args){

        int[] numeros = new int[5];
        cargarNumeros(numeros);
        mostrarNumeros(numeros);

    }

    private  static void mostrarNumeros(int[] numeros){
        System.out.println("Estos son los numeros ingresados");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static int pedirNumeroAlUsuario(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = tec.nextInt();
        return  numero;
    }
    private static void cargarNumeros(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int numero = pedirNumeroAlUsuario();
            numeros[i] = numero;
        }
    }
}
