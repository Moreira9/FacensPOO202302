package Fundamentos.Abstrato;

/**
 *
 * @author edson
 */
public class AulaAbstrata {
    public static void main(String[] args) {
        //Animal a = new Animal();
        //Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        System.out.println(c.respirar());
        System.out.println(c.mover());
        System.out.println(c.mamar());
    }
}
