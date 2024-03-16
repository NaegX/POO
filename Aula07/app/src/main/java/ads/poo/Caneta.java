package ads.poo;

public class Caneta {
    
    // Atributos 
    private String cor ;
    private int unidadeTinta ;

    public Caneta(String cor, int unidadeTinta) {
        this.cor = cor;
        this.unidadeTinta = unidadeTinta;
    }

    public Caneta(String cor){
//        this.unidadeTinta = 100;
//        this.cor = cor;
        this( cor, 100);
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "cor='" + cor + '\'' +
                ", unidadeTinta=" + unidadeTinta +
                '}';
    }

    public Caneta(){
//        this.unidadeTinta = 100 ;
//        this.cor = "vermelha";
        this("vemelha", 100);
    }












    // Métodos

    public String usandoCaneta(){
        if (unidadeTinta>0){
            unidadeTinta -- ;
            return "Desenhando na cor " + cor;
        }else{
            return "caneta vazia";
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getUnidadeTinta() {
        return unidadeTinta;
    }

    public void setUnidadeTinta(int unidadeTinta) {
        this.unidadeTinta = unidadeTinta;
    }

    
}
