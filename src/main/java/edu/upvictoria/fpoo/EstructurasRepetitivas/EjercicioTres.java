package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioTres {
    public int suma(int a, int b){
        return a+b;
    }
    public EjercicioTres()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Implemente un programa para obtener la suma de diez números enteros mediante la utilización\n" +
                "de un ciclo Desde.");
        int sumatoria=0;
        int a;
        for(int i=0;i<10;i++){
            System.out.println("Ingrese el " + (i+1)+" numero");
            entrada=leer.readLine();
            a=Integer.parseInt(entrada);
            sumatoria=suma(a,sumatoria);
        }
        System.out.println("Sumatoria: " +sumatoria);
    }
}
