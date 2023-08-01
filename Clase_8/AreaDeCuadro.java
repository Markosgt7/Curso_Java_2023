package Clase_8;
import  java.util.Scanner;
public class AreaDeCuadro {
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingresa la base de su cuadro");
        float base = tc.nextInt();
        System.out.println("Ingresa la altura de su cuadro");
        float altura = tc.nextInt();

        float area=obtenerAreaCuadro(base,altura);
        System.out.println("el area es:"+ area );
    }
   private static float obtenerAreaCuadro(float base, float altura){
         return   base * altura;
   }
}
