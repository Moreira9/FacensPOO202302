package Fundamentos.associacao;

import Fundamentos.heranca.Ferrari;

/**
 *
 * @author edson
 */
public class TesteNivelAcessibilidade {
    public static void main(String[] args) {
        Automovel a = new Automovel("branca", 0);
        System.out.println(a.ano);
    }
}
