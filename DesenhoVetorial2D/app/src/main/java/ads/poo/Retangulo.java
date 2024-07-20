package ads.poo;

public class Retangulo extends ObjetoDeDesenho{
    private Ponto verticeI;
    private Ponto verticeF;
    
    public Retangulo(String corDaLinha, Ponto verticeI, Ponto verticeF) {
        super(corDaLinha);
        this.verticeI = verticeI;
        this.verticeF = verticeF;
    }

    public Ponto getVerticeI() {
        return verticeI;
    }

    public void setVerticeI(Ponto verticeI) {
        this.verticeI = verticeI;
    }

    public Ponto getVerticeF() {
        return verticeF;
    }

    public void setVerticeF(Ponto verticeF) {
        this.verticeF = verticeF;
    }

    @Override
    public String desenhar() {
        return "Retangulo [corDaLinha=" + corDaLinha + ", verticeI=" + verticeI + ", verticeF=" + verticeF + "]";
    }

    

}
