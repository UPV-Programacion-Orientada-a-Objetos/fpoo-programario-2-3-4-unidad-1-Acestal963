package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EjercicioSeis {

    public float suma(float[] ahorro){
        float sum=0;
        for(int i=0;i<12;i++){
            sum+=ahorro[i];
        }
        return sum;
    }
    public EjercicioSeis()throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Seis");
        System.out.println("Implemente un programa para determinar cuánto ahorrará una persona en un año, si al final de\n" +
                "cada mes deposita variables cantidades de dinero; además, se requiere saber cuánto lleva\n" +
                "ahorrado cada mes.");
        String[] meses={"Enero","Febrero","Marzo","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octube","Noviembre","Diciembre"};
        float []ahorro=new float[12];
        for(int i=0;i<12;i++){
            for(int j=0;j<i;j++){
                System.out.print("Mes: "+meses[j]);
                System.out.println(" Ahorro: "+ahorro[j]);
            }
            System.out.println("Ingrese el ahorro del mes de "+meses[i]);
            entrada=leer.readLine();
            ahorro[i]=Float.parseFloat(entrada);
        }
        System.out.println("Ahorro anual: " +suma(ahorro));
    }
}
