package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjercicioDos {
    public float suma(float a,float b){
         return a+b;
    }
    public EjercicioDos()throws IOException{
           BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
           String entrada;
           System.out.println("Ejercicio 2");
           System.out.println("Implemente un programa para obtener la suma de diez números flotantes mediante la utilización\n" +
                   "de un ciclo Repite.");
           float sumar=0;
           float a;
           int i=0;
           do{
               System.out.println("Ingrese el " + (i+1)+" numero");
               entrada=leer.readLine();
               a=Float.parseFloat(entrada);
               sumar=suma(a,sumar);
               i++;
           }while(i<10);
        System.out.println("Sumatoria: " +sumar);

    }
}
