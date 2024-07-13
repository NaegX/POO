package ads.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distancia;
    
    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia,
            int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    @Override
    public String imprimirDados() {
        
        return super.imprimirDados() + "SemFio [frequencia=" + frequencia + ", canais=" + canais + ", distancia=" + distancia + "]";
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
 
    
}
