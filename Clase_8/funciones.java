package Clase_8;

public class funciones {
    public static void main(String[] args){
        //llamada a la funcion las veces que querramos
        calcularPrecioFinal("Pantalon", 150, 35);
        calcularPrecioFinal("Camisa",200,15);

    }
    //funcion que permite realizar el calculo de un procto
    public static void calcularPrecioFinal(String producto, double precio, double procentaje_desc){
        double precio_final= precio-(procentaje_desc * precio) / 100;
        System.out.println("El precio del "+ producto+" es: de Q"+precio_final);
    }
}
