package Clase_8;

public class gen {
    public  static  void main(String[] args){
        //generar contraseñas
        String nuevoPassword = generarPass();
        System.out.println(nuevoPassword);


    }
    private static String generarPass(){
        double aleatorio = Math.random()*10000000;
        long numAleatorio = Math.round(aleatorio);
        String passwordCreated="abcCDdD"+ numAleatorio;
        return  passwordCreated;
    }

}
