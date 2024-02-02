package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class EjercicioDiez {

    public double suma(double a,double b){
        return a+b;
    }
    public EjercicioDiez() throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println(("Ejercicio Diez"));
        System.out.println("Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la\n" +
                "semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá por las\n" +
                "horas trabajadas. Implemente un programa para determinar ésto.");
        double horas, sueldoHora;
        double SumHora=0;
        for(int i=0;i<6;i++){
            System.out.println("Horas trabajadas, Dia " +(i+1));
            entrada= leer.readLine();
            horas=Double.parseDouble(entrada);
            SumHora=suma(horas,SumHora);
        }
        System.out.println("Ingrese el sueldo/hora");
        entrada= leer.readLine();
        sueldoHora=Double.parseDouble(entrada);
        System.out.println("Sueldo a pagar: " +(sueldoHora*SumHora));

    }

}
