package edu.upvictoria.fpoo.EstructurasSelectivas;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class EjercicioVeinteTest extends TestCase {
@Test
    public void testSalario()throws IOException {
        int puntos=20;
        double salario=1000;
        EjercicioVeinte pr=new EjercicioVeinte();
        assertEquals(1000,pr.salario(puntos,salario));
    }
}