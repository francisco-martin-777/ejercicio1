/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duvbarte
 */
public class Ejercicio1ABIT {
    private  Ejercicio1 instance ;
    
    public Ejercicio1ABIT() {
    }
    
    /*@BeforeClass                  no los necesitare
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }*/
    
    @Before
    public void setUp() {
        instance = new Ejercicio1();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

      /**
     * Caso 3.1: Datos de entrada: cadena de 5 caracteres. Resultado esperado (Salida): La
    aplicación no permite el ingreso del dato y muestra un mensaje de error.
     */
    @Test
    public void testCaso3_1() {
        System.out.println("Caso 3.1: Datos de entrada: cadena de 5 caracteres. Resultado esperado (Salida): La\n"
                + "    aplicación no permite el ingreso del dato y muestra un mensaje de error.");
        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. La longuitud de la cadena es < 6";
        String result = instance.IntroducirCadena("amigo");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Caso 3.2: Datos de entrada: cadena de 7 caracteres, incluyendo uno o más caracteres no
    alfabéticos. Resultado esperado (Salida): La aplicación no permite el ingreso del dato y
    muestra un mensaje de error.
     */
    @Test
    public void testCaso3_2() {
        System.out.println();
        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. No es alfabética.";
        String result = instance.IntroducirCadena("amigo12");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Caso 3.3: Datos de entrada: cadena de 7 caracteres, solo de caracteres alfabéticos. Resultado
    esperado (Salida): La aplicación permite el ingreso del dato.
     */
    @Test
    public void testCaso3_3() {
        System.out.println();
        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena correcta. La aplicación permite el ingreso.";
        String result = instance.IntroducirCadena("miamigo");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Caso 3.4: Datos de entrada: cadena de 11 caracteres. Resultado esperado (Salida): La
    aplicación no permite el ingreso del dato y muestra un mensaje de error.
     */
    @Test
    public void testCaso3_4() {
        System.out.println();
        //Ejercicio1 instance = new Ejercicio1();
        String expResult = "Cadena incorrecta. La longuitud de la cadena es > 10";
        String result = instance.IntroducirCadena("amiguisimos");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
