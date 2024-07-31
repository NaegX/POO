package ads.poo;

import java.util.Arrays;

public enum DiasDaSemana {
    
    DOM(1,"domingo"), 
    SEG(2,"segunda-feira"), 
    TER(3,"terça-feira"), 
    QUA(4,"quarta-feira"), 
    QUI(5, "quinta-feira"), 
    SEX(6 , "sexta-feira"), 
    SAB(7 ,"sabado");

    private int codigo;
    private String extenso;

    private DiasDaSemana(int codigo ,String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String toString() {
        return extenso;
    }
    
    
}
