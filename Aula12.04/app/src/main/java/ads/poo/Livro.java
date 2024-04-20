package ads.poo;

import java.util.ArrayList;

public class Livro{

    private String titulo;
    private Double preco;
    private String isbn ;
    private ArrayList<Autor> autores;
    
    public Livro(String titulo, Double preco, String isbn, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.preco = preco;
        this.isbn = isbn;
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", preco=" + preco + ", isbn=" + isbn + ", autores="
                + autores + "]";
    }
    
   
    


}