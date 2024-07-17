package ads.poo;

public class Aldeao extends Pessoa{

    public Aldeao(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Aldeao []";
    }

    @Override
    public String ataque() {
        // TODO Auto-generated method stub
        return "Eu sou um Aldeao e" + super.ataque();
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Eu sou um Aldeao e" + super.mover();
    }
    
}
