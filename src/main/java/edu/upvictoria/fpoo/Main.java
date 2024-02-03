package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasRepetitivas.*;
import edu.upvictoria.fpoo.EstructurasSelectivas.*;
import edu.upvictoria.fpoo.EstructurasSelectivas.Menu1;
import edu.upvictoria.fpoo.EstructurasRepetitivas.Menu2;
import edu.upvictoria.fpoo.Arreglos.Menu3;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        int opcion=0;
           do{
               BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
               String entrada;
               System.out.println("1)EstructurasSelectivas");
               System.out.println("2)EstructurasRepetitivas");
               System.out.println("3)Arreglos");
               System.out.println("4)Salir");
               entrada=leer.readLine();
               opcion=Integer.parseInt(entrada);
               switch (opcion) {
                   case 1:
                       Menu1 pr = new Menu1();
                       break;
                   case 2:
                       Menu2 pr1 = new Menu2();
                       break;
                   case 3:
                       Menu3 pr2 = new Menu3();
                       break;
                   default:
                       break;
               }
           }while(opcion != 4);
    }
}