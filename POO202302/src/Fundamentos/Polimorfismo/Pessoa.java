package Fundamentos.Polimorfismo;

/**
 *
 * @author edson
 */
public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    
    

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
    /*
    public void comer(Arroz arroz){
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao){
        this.peso += feijao.getPeso();
    }
    public void comer(Carne carne){
        this.peso += carne.getPeso();
    }
*/
}
