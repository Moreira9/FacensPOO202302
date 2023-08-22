package Fundamentos;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(15);
        //a.pi = 10;
        //a.r = 15;
        System.out.println("valor de a: "+a.calcularArea());
        AreaCirc b = new AreaCirc();
        //b.pi = 10;
        System.out.println("Valor de b: "+AreaCirc.calcularArea(15));
        System.out.println("valor de a: "+a.calcularArea());
        
        
    }
}
