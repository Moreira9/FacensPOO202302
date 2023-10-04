package Fundamentos.heranca;

import Fundamentos.associacao.Automovel;

public class Ferrari extends Automovel implements Luxo, Esportivo{

    public Ferrari() {
        super(null, 0);
    }

    @Override
    public void acelerar() {
        super.acelerar(); 
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    @Override
    public String ligarOAr() {
       return "ligado";
    }

    @Override
    public String desligarOAr() {
       return "desligado"; 
    }

    @Override
    public String ligarOTurbo() {
        return "turbo ligado";
    }

    @Override
    public String desligarOTurbo() {
        return "turbo desligado";
    }
    
}
