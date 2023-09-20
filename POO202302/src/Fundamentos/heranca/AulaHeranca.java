package Fundamentos.heranca;

import Fundamentos.associacao.Automovel;
import Fundamentos.associacao.Pessoa;
import java.util.ArrayList;

public class AulaHeranca {
    public static void main(String[] args) {
        Fusca f = new Fusca("preto", 1962);
        f.acelerar();
        f.acelerar();
        f.frear();
        System.out.println(f.getMotor().getFatorPotencia());
        Ferrari fer = new Ferrari();
        fer.setAno(2023);
        fer.setCor("vermelha");
        System.out.println(fer.getMotor().getFatorPotencia());
        Automovel auto = new Automovel("azul", 2000);
        System.out.println(f.toString());
        System.out.println(fer.toString());
        fer.acelerar();
        System.out.println(fer.getMotor().getFatorPotencia());
      
        //exemplo mostrando que mesmo com tipos diferentes(Fusca e Ferrari), 
        //eu consigo colocar ambos na lista porque são automóveis
        ArrayList<Automovel> automoveis = new ArrayList<>();
        automoveis.add(fer);
        automoveis.add(f);
        for (Automovel a : automoveis) {
            System.out.println(a.getCor());
        }
        
        //demostração que as classes herdadas se comportam como os automóveis
        //da aula de associação, inclusive o comportamento com associação bidirecional
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Edson");
        pessoa.setAutomoveis(automoveis);
        pessoa.getAutomoveis().get(0).getMotor()
                .getAutomovel().getDono();
    }
}
