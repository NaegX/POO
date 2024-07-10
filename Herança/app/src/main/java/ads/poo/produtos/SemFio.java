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
    
}
