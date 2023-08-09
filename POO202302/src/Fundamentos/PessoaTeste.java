package Fundamentos;

/**
 *
 * @author edson
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //p.nome = "Edson";
        p.DarUmNome("Edson");
        //p.idade = 28;
        //p.telefone = "(15) 323232";
        p.setIdade(28);
        p.setTelefone("(15) 323232");
        //System.out.println(p.nome);
        Pessoa p2 = new Pessoa();
        //p.nome = "Guilherme";
        p2.DarUmNome("Guilherme");
        //System.out.println(p.perguntarONome());
        //System.out.println(p.responderONome());
        String teste = p.perguntarONome(p2);
        System.out.println(teste);
        

    }
}
