package edu.upvictoria.fpoo.EstructurasSecuenciales;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class EjercicioUno_Uno {
    public EjercicioUno_Uno()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercico Uno");
        System.out.println("Se desea implementar un programa para determinar cuál de dos valores\n" +
                "proporcionados es el mayor.");
        double a;
        double b;
        System.out.println("Ingrese el primer valor");
        entrada=leer.readLine();
        a=Double.parseDouble(entrada);
        System.out.println("Ingrese el segundo valor");
        entrada=leer.readLine();
        b=Double.parseDouble(entrada);
        Numero_Mayor_1_1 pr=new Numero_Mayor_1_1();
        System.out.println("EL numero mayor es: "+pr.Num_May_Men(a,b));



    }

}
