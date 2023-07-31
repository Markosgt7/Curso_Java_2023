package clase_6;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        //ejercicio de numero aleatorio
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado;
        int numeroAleatorio = (int) Math.floor(Math.random()*100);

        System.out.println("¿Cuál es el número aleatorio?");
        numeroIngresado = teclado.nextInt();
        if(numeroIngresado == numeroAleatorio){
            System.out.println("Adivinaste el número!!");
        }else{
            System.out.println("upp!! número equivocado 😔");
        }


    }
}
