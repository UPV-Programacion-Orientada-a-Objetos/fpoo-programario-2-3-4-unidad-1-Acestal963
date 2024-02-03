package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EjercicioVeinticinco {
    public static void P25() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numAños = 0;
        double inversionInicial = 0.0;

        try {
            System.out.println("Ingrese la cantidad de  anios:");
            numAños = Integer.parseInt(reader.readLine());

            System.out.println("Ingrese la cantidad de inversión inicial:");
            inversionInicial = Double.parseDouble(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer los datos. Intente de nuevo");
            return;
        }

        double interesAnual = 0.10;
        double inversionFinal = inversionInicial;

        for (int año = 1; año <= numAños; año++) {
            inversionFinal += inversionFinal * interesAnual;
        }

        System.out.println("La iversión final después de " + numAños + " años es: $" + inversionFinal);
    }
}
