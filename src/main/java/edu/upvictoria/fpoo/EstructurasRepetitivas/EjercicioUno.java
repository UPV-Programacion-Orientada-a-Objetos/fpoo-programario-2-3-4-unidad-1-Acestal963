package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioUno {
     public EjercicioUno()throws IOException{
         BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
         String entrada;
         System.out.println("Ejercicio Uno");
         System.out.println("Implemente un programa para obtener la suma de diez números flotantes mediante la utilización\n" +
                 "de un ciclo “Mientras”.");
         int i=0;
         float sumatoria=0;
         Suma_1 pr=new Suma_1();

         while(i<10){
             float a;
             System.out.println("Ingrese el "+ (1+i) +" numero");
             entrada=leer.readLine();
             a=Float.parseFloat(entrada);
             sumatoria=pr.suma(sumatoria,a);
             i++;
         }
         System.out.println("Sumatoria: " +sumatoria);
     }
}
