package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class EjercicioOcho {
    public EjercicioOcho()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Ocho");
        System.out.println("Implemente un programa para generar e imprimir los números pares que se encuentran entre 0 y\n" +
                "100.");
        int a=0;
        for(int i=0;i<=100/2;i++){
            System.out.println("Par " +a);
            a= a+2;
        }
    }
}
