package ads.poo;

import java.util.Random;

public class Buzz {

    // Atributos
    private boolean capaceteAberto = false;
    private boolean asaAberta = false;
    private String[] frase = { "Ao infinito e além",
                                "Preparando para voar!",
                                "Comando estelar pronto para voar!",
                                "Consigo resolver todas as missões do universo.",
                                "Saudações, eu sou o Buzz Lightyear e venho em missão de paz.",
                                "Isto não é voar. Isto é cair, com estilo!"
                            };

    // Métodos
        
    public boolean isCapaceteAberto(){
        return capaceteAberto;
    }

    public String dispararLases(){
        return "Disparando laser";
    }

    public String golpear(){
        return "Golpeando";
    }

     public String frasesAleatorias() {
        Random f = new Random();
        return frase[f.nextInt(6)];
    }
    
    public boolean abrirFecharCapacete(){
        capaceteAberto = !capaceteAberto;
        return capaceteAberto;
    }

    public boolean abrirFecharAsa(){
        asaAberta = !asaAberta;
        return asaAberta;
    }
}