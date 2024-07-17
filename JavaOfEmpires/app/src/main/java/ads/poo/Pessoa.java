package ads.poo;

public class Pessoa {

    private double vida;
    private double ataque;
    private double velocidade;

    
    
    public Pessoa(double vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public double getVida() {
        return vida;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }
    public double getAtaque() {
        return ataque;
    }
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


    @Override
    public String toString() {
        return "Pessoa [vida=" + vida + ", ataque=" + ataque + ", velocidade=" + velocidade + "]";
    }

    public String ataque() {
        return "estou atacando";
    }

    public String mover() {
        return "estou me movendo";
    }

}
