package Fundamentos.Polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author edson
 */
public class AulaPolimorfismo {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(64);
        Feijao f = new Feijao();
        f.setPeso(0.3);
        Carne c = new Carne();
        c.setPeso(0.1);
        Arroz a  = new Arroz();
        a.setPeso(1);
        System.out.println(p.getPeso());
        p.comer(a);
        p.comer(f);
        p.comer(c);
        System.out.println(p.getPeso());
        
        //problema da Liggia
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(a);
        comidas.add(f);
        comidas.add(c);
        for (Comida co : comidas) {
            System.out.println(co.getPeso());
            if (co instanceof Carne) {
                System.out.println("Peso da carne: "+
                        co.getPeso());
            }
        }
    }
}
