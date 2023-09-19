package Fundamentos.heranca;

import Fundamentos.associacao.Automovel;

public class Ferrari extends Automovel{

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
    
}
