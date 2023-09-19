package Fundamentos.heranca;

import Fundamentos.associacao.Automovel;


public class Fusca extends Automovel{

    public Fusca(String cor, int ano) {
        super(cor, ano);
    }
    public Fusca(String cor){
        this(cor, 0);
        
        
    }
    
    
}
