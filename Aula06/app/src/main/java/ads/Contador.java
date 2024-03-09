package ads;

import java.util.Scanner;

public class Contador {
    Scanner teclado = new Scanner(System.in);
   
    //atributo
    int valorAtual;
    int contagem;

    
    //metodos

    public int atribuir(int cont){
        int atrib;
        atrib = teclado.nextInt();
        cont=atrib;
        return cont;
    }
    public int Atual(){
        return contagem;
    }
    public int Incrementar(int cont){
        contagem+=cont;
        return cont;
    }
}
