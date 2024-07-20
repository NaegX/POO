package ads.poo;

public abstract class ObjetoDeDesenho {
    protected String corDaLinha ;

    public String getCorDaLinha() {
        return corDaLinha;
    }

    public void setCorDaLinha(String corDaLinha) {
        this.corDaLinha = corDaLinha;
    }

    public ObjetoDeDesenho(String corDaLinha) {
        this.corDaLinha = corDaLinha;
    }

    public abstract String desenhar();
}
