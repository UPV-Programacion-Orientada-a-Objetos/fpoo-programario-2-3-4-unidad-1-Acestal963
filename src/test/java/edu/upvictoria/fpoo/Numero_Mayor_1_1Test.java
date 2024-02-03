package edu.upvictoria.fpoo;

import junit.framework.TestCase;

public class Numero_Mayor_1_1Test extends TestCase {

    public void testNum_May_Men() {
        double a=9;
        double b=10;
        Numero_Mayor_1_1 pr=new Numero_Mayor_1_1();
        assertEquals(b,pr.Num_May_Men(a,b));
    }
    public void testNum_May_Men_2() {
        double a=9.90;
        double b=10.98;
        Numero_Mayor_1_1 pr=new Numero_Mayor_1_1();
        assertEquals(b,pr.Num_May_Men(a,b));
    }
    public void testNum_May_Men_3() {
        double a=89373;
        double b=1045;
        Numero_Mayor_1_1 pr=new Numero_Mayor_1_1();
        assertEquals(a,pr.Num_May_Men(a,b));
    }
}