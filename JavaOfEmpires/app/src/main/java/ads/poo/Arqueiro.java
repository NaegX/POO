package ads.poo;

public class Arqueiro extends Pessoa 
implements Guerreiro{

    public Arqueiro(double vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Arqueiro []";
    }

    @Override
    public String ataque() {
        // TODO Auto-generated method stub
        return "Eu sou um Arqueiro e " ;
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Eu sou um Arqueiro e " ;
    }
    
    
}
