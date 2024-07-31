package ads.poo;

public enum Baralho {
    AS(1,"A"),
    DOIS(2,"Dois"),
    TRES(3,"Tres"),
    QUATRO(4,"Quatro"),
    CINCO(5,"Cinco"),
    SEIS(6,"Seis"),
    SETE(7,"Sete"),
    OITO(8,"Oito"),
    NOVE(9,"Nove"),
    DEZ(10,"Dez"),
    VALETE(11,"J"),
    DAMA(12,"Q"),
    REI(13,"K");

    private int numero;
    private String extenso;

    private Baralho(int numero, String extenso){
        this.numero = numero;
        this.extenso = extenso;
    }

    

    public int getNumero() {
        return numero;
    }



    public String getExtenso() {
        return extenso;
    }



    public String toString() {
        return extenso; 
    }

}
