package Clase_8;

import java.util.Scanner;

public class AreaDeTriangulo {
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingresa la base de su triangulo");
        float base = tc.nextInt();
        System.out.println("Ingresa la altura de su triangulo");
        float altura = tc.nextInt();

        float area=obtenerAreaTiangulo(base,altura);
        System.out.println("el area es:"+ area );
    }
    private static float obtenerAreaTiangulo(float base, float altura){
        return  ( base * altura)/2;
    }
}
