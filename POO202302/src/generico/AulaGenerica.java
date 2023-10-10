package generico;

import Fundamentos.associacao.Pessoa;
import java.util.ArrayList;


public class AulaGenerica {
    public static void main(String[] args) {
        int x = 3;
        float y = 4.5f;
        double z = 30;
        String nome = "Edson";
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        
        ArrayList<Object> lst = new ArrayList<>();
        lst.add(x);
        lst.add(y);
        lst.add(nome);
        lst.add(p);
       
        //trabalhando com Object
        QualquerCoisa q1 = new QualquerCoisa();
        q1.setCoisa(x);
        QualquerCoisa q2 = new QualquerCoisa();
        q2.setCoisa(y);
        System.out.println("Soma: "+
                q1.getCoisa() + q2.getCoisa());
        
        //classe genérica
        Generica<Pessoa, String> g1 = new Generica<>();
        g1.setObjeto1(p);
        g1.setObjeto2(nome);
        
        
    }
}
