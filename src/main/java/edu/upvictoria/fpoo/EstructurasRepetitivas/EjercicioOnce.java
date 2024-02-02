package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class EjercicioOnce {

    public double KM(double Km_A,double KM_B){
        int P=0;
        double km=0;
        do{
            Km_A=Km_A+1;
            KM_B=KM_B-1;
            if(Km_A==KM_B){
                P=1;
            }
            km=Km_A;
        }while(P==0);
        return km;
    }


    public EjercicioOnce()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Once");
        System.out.println("Una persona se encuentra en el kilómetro 70 de la carretera Aguascalientes-Zacatecas, otra se\n" +
                "encuentra en el km 150 de la misma carretera, la primera viaja en dirección a Zacatecas,\n" +
                "mientras que la segunda se dirige a Aguascalientes, a la misma velocidad constante. Implemente\n" +
                "un programa para determinar en qué kilometro de esa carretera se encontrarán.");
        System.out.println("Ingrese la el Km de la primera posicion: ");
        entrada=leer.readLine();
        double Km_A=Double.parseDouble(entrada);
        System.out.println("Ingrese la el Km de la segunda posicion: ");
        entrada=leer.readLine();
        double Km_B=Double.parseDouble(entrada);
        System.out.println("Se encontraran en el Km: " +KM(Km_A,Km_B));
    }
}
