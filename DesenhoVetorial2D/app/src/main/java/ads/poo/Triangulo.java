package ads.poo;

public class Triangulo extends ObjetoDeDesenho{

    private Ponto v1;
    private Ponto v2;
    private Ponto v3;

    public Triangulo(String corDaLinha, Ponto v1, Ponto v2, Ponto v3) {
        super(corDaLinha);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Ponto getV1() {
        return v1;
    }
    public void setV1(Ponto v1) {
        this.v1 = v1;
    }
    public Ponto getV2() {
        return v2;
    }
    public void setV2(Ponto v2) {
        this.v2 = v2;
    }
    public Ponto getV3() {
        return v3;
    }
    public void setV3(Ponto v3) {
        this.v3 = v3;
    }
    @Override
    public String desenhar() {
        return "Triangulo [corDaLinha=" + corDaLinha + ", v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

    
}
