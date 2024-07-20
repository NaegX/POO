package ads.poo;

public class Soldado extends Pessoa {

    public Soldado(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Soldado []";
    }

    public String ataque() {
        // TODO Auto-generated method stub
        return "Eu sou um Soldado e estou atacando";
    }
    
}
