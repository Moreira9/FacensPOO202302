package Fundamentos.heranca;

import Fundamentos.associacao.Automovel;

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
      
    }
}
