package edu.upvictoria.fpoo.EstructurasRepetitivas;
import com.sun.source.tree.NewArrayTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioCuatro {

    public int suma(int a,int b){
        return a+b;
    }
    public float promedio(int sumatoria,int alumnos){
        return (sumatoria/alumnos);
    }

    public EjercicioCuatro() throws IOException{
     BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
     String entrada;
     System.out.println("Ejercicio CUatro");
     System.out.println("Implemente un programa para obtener la edad promedio de un grupo de N alumnos.");
     System.out.println("Ingrese el numero de alumnos");
     int alumnos;
     entrada= leer.readLine();
     alumnos=Integer.parseInt(entrada);
     int edad;
     int sumatoria=0;
     for(int i=0;i<alumnos;i++){
         System.out.println("Ingrese la edad del "+(i+1)+" alumno");
         entrada=leer.readLine();
         edad=Integer.parseInt(entrada);
        sumatoria=suma(sumatoria,edad);
     }
     System.out.println("EL promedio de edad es de: " +promedio(sumatoria,alumnos));

    }

}
