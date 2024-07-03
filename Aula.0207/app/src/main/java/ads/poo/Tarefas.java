package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarefas {
    private String titulo;
    private LocalDate prazoEntrega;
    private LocalDate dataConclusão;
    private Categoria categoria;
    private ArrayList<Pessoa> pessoas;
    
    public Tarefas(String titulo, LocalDate prazoEntrega, LocalDate dataConclusão, Categoria categoria,
            ArrayList<Pessoa> pessoas) {
        this.titulo = titulo;
        this.prazoEntrega = prazoEntrega;
        this.dataConclusão = dataConclusão;
        this.categoria = categoria;
        this.pessoas = pessoas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public LocalDate getDataConclusão() {
        return dataConclusão;
    }

    public void setDataConclusão(LocalDate dataConclusão) {
        this.dataConclusão = dataConclusão;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public void removePessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public void addCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}




