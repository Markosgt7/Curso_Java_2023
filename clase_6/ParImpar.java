package clase_6;
import  java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("ingrese un número entero para saber si este es par o impar");
        int numero = kb.nextInt();
        if(numero % 2 == 0){
            System.out.println(numero+" es par");
        }else{
            System.out.println(numero+" es impar");
        }

    }
}
