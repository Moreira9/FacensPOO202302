package Fundamentos;


public class AreaCirc {
    public static final double PI = 3.1415;
    private double r;

    public AreaCirc(double r) {
        //pi = 3.1415;
        this.r = r;
    }

    public AreaCirc() {
        //pi = 3.1415;
    }
    /*
    public AreaCirc(double r, double pi){
        
        this.pi = pi;
        this.r = r;
    }
    */



    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    
    public double calcularArea(){
        return PI * r * r;
    }
    public static double calcularArea(double raio){
        return PI * Math.pow(raio, 2);
    }
}
