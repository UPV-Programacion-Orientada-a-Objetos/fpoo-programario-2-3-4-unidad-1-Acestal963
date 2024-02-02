package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class EjercicioNueve {
    public EjercicioNueve() throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Nueve0");
        System.out.println("Implemente un programa para generar N elementos de la sucesión de Fibonacci (0, 1, 1, 2, 3, 5,\n" +
                "8, 13,...).");
        int elem;
        System.out.println("Ingrese la cantidada de elementos");
        entrada=leer.readLine();
        elem=Integer.parseInt(entrada);
        int []febo=new int[elem];
        febo[0]=0;
        for(int i=0;i<elem;i++){
            if(i==0){
                febo[i]=0;
            }else{
                if(febo[i-1]==0){
                    febo[i]=1;
                }else{
                    febo[i]=febo[i-2]+febo[i-1];
                }
            }
            System.out.println((i+1)+".- "+febo[i]);
        }


    }
}
