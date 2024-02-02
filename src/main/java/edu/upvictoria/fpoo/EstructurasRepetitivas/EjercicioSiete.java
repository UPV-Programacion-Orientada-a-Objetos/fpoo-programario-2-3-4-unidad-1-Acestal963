package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioSiete {

    public EjercicioSiete() throws IOException{
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ejercicio Siete");
        System.out.println("Implemente un programa para determinar, de N cantidades, cuántas son menores o iguales a\n" +
                "cero y cuántas mayores a cero.");
        int menor=0,mayor=0, igual=0;
        int cant;
        double elem;
        System.out.println("Ingrese la cantidad de elementos ");
        entrada=leer.readLine();
        cant=Integer.parseInt(entrada);

        for(int i=0;i<cant;i++){
            System.out.println("Ingrese el elemento " +(i+1));
            entrada=leer.readLine();
            elem=Double.parseDouble(entrada);
            if(elem>0.0){
                mayor++;
            }else if(elem<0){
                menor++;
            }else if(elem==0){
                igual++;
            }
        }
        System.out.println("Cantidad de elementos>0: "+mayor);
        System.out.println("Cantidad de elementos<0: "+menor);
        System.out.println("Cantidad de elementos==0: "+igual);
    }
}
