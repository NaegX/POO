package ads.poo;

public class Circulo extends ObjetoDeDesenho{
    private Ponto centro;
    private double raio;
    public Circulo(String corDaLinha, Ponto centro, double raio) {
        super(corDaLinha);
        this.centro = centro;
        this.raio = raio;
    }
    public Ponto getCentro() {
        return centro;
    }
    public void setCentro(Ponto centro) {
        this.centro = centro;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public String desenhar() {
        return "Circulo [corDaLinha=" + corDaLinha + ", centro=" + centro + ", raio=" + raio + "]";
    }

    
    
}
