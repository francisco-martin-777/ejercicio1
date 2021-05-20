*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author javie
 */

public class Test {
    
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1 ejer1 = new Ejercicio1();

        System.out.println("Cadena '1' :" + ejer1.IntroducirCadena("1"));
        System.out.println("Cadena 'a' :" + ejer1.IntroducirCadena("a"));
        System.out.println("Cadena '#' :" + ejer1.IntroducirCadena("#"));
        
        System.out.println("Cadena 'miCadena' :" + ejer1.IntroducirCadena("miCadena"));
  
        System.out.println("Cadena 'miCadena0' :" + ejer1.IntroducirCadena("miCadena0"));
        System.out.println("Cadena 'miCadenamiCadena' :" + ejer1.IntroducirCadena("miCadenamiCadena"));
        System.out.println("Cadena 'miCadenami0Cadena' :" + ejer1.IntroducirCadena("miCadenami0Cadena"));      
    }
    
    
}
