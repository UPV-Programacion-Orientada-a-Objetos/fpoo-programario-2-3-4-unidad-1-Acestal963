package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class EjercicioCinco {


    public double suma(double a,double b){
        return a+b;
    }
    public double promedio(double estatura,double personas){
        return (estatura/personas);
    }

    public EjercicioCinco()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Cinco");
        System.out.println("Implemente un programa para obtener la estatura promedio de un grupo de personas, cuyo\n" +
                "número de miembros se desconoce, el ciclo debe efectuarse siempre y cuando se tenga una\n" +
                "estatura registrada.");
        double estatura;
        int personas=0;
        double sumatoria=0;
        while(true){
            System.out.println("Ingrese la estatura (cm) ");
            entrada= leer.readLine();
            estatura=Double.parseDouble(entrada);
            if(estatura==0){
                break;
            }
            sumatoria=suma(sumatoria,estatura);
            personas++;
        }
        System.out.println("El promedio de estatura es de: " +promedio(sumatoria,personas));
    }
}
