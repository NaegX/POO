package ads.poo;

public enum Naipe {
    PAUS("\u2663"),
    COPAS("\u2665"),
    ESPADAS("\u2660"),
    OUROS("\u2666");
    
    private String naipe;

    private Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String toString(){
        return naipe;
    }
}
