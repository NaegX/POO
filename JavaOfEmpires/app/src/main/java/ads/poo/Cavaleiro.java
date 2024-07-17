package ads.poo;

public class Cavaleiro extends Pessoa{

    public Cavaleiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Cavaleiro []";
    }

    @Override
    public String ataque() {
        // TODO Auto-generated method stub
        return "Eu sou um Cavaleiro e " + super.ataque();
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Eu sou um Cavaleiro e " + super.mover();
    }

    
}
