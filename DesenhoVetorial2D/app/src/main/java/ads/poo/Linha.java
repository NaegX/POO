package ads.poo;

public class Linha extends ObjetoDeDesenho{
    private Ponto inicio;
    private Ponto fim;
    
    public Linha(String corDaLinha, double x1 ,double y1,double x2 , double y2) {
        super(corDaLinha);
        this.inicio = new Ponto (corDaLinha, x1,y1);
        this.fim = new Ponto (corDaLinha, x2,y2);
    }

    
    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return "Linha [corDaLinha=" + corDaLinha + ", inicio=" + inicio + ", fim=" + fim + "]";
    }

    
}
