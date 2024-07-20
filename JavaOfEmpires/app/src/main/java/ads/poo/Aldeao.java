package ads.poo;

public class Aldeao extends Pessoa 
implements Guerreiro, Coletador{
    

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
        return "Eu sou um Aldeao e" ;
    }

    @Override
    public String mover() {
        // TODO Auto-generated method stub
        return "Eu sou um Aldeao e" ;
    }
    
    public String coletarMadeira(){
        return "Colentando madeira";
    }
    public String coletarOuro(){
        return "Coletando Ouro";
    }
}
