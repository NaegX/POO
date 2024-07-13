package ads.poo.produtos;

public class Celular extends SemFio{
    private String sistemaOperacional;

    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia,
            int canais, double distancia, String sistemaOperacional) {
        super(codigo, numSerie, modelo, peso, dimensao, frequencia, canais, distancia);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String imprimirDados() {

        return super.imprimirDados() + "Celular [sistemaOperacional=" + sistemaOperacional + "]";
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    
}
