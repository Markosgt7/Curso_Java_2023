package clase_6;
import  java.util.Scanner;
public class MayorYMenorNumero {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int numero1 = kb.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = kb.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero3 = kb.nextInt();

        if( numero1 > numero2 && numero2 > numero3){
            System.out.println("el "+ numero1 +" es el mayor y "+ numero3+" es menor");
        }
        if( numero2 > numero1 && numero1 > numero3){
            System.out.println("el "+ numero2 +" es el mayor y "+ numero3+" es menor");
        }
        if( numero3 > numero2 && numero2 > numero1){
            System.out.println("el "+ numero3 +" es el mayor y "+ numero1+" es menor");
        }
        if (numero3 > numero1 && numero1 > numero2){
            System.out.println("el "+ numero3 +" es el mayor y "+ numero2+" es menor");
        }

    }
}
