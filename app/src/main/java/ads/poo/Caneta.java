package ads.poo;

public class Caneta {
    
    // Atributos 
    private String cor = "preto";
    private int unidadeTinta = 100 ;

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
