package Fundamentos.associacao;


public class Motor {
    private double fatorPotencia = 1000;
    private Automovel automovel;

    public Motor(Automovel auto) {
        automovel = auto;
    }
    
    

    public double getFatorPotencia() {
        return fatorPotencia;
    }

    public void setFatorPotencia(double fatorPotencia) {
        this.fatorPotencia = fatorPotencia;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
    
}
