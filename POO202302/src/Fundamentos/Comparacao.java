package Fundamentos;

import Fundamentos.associacao.Pessoa;
        
        
public class Comparacao {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        System.out.println(x == y);
        Fundamentos.associacao.Pessoa p1 = new Pessoa();
        p1.setNome("Edson");
        
        Fundamentos.associacao.Pessoa p2 = new Pessoa();
        p2.setNome("Edson");
        
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
