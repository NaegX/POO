package ads.poo;

/**
 * Ao criar o carro posso fornecer a velocidade atual.
 * se a vekicudade fpr < 0 ou > 200 , então o carro começa com 0
 */
public class Carro {

    //    Atributo
    private int velocidadeAtual;


    // Método

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public int setVelocidadeAtual(int v) {
        if (v < 0 || v > 200){
            velocidadeAtual = 0;
        }else {
            velocidadeAtual = v;
        }
        return  velocidadeAtual;
    }
    public int Acelerar(int acelerar){
        if ( acelerar < 0){
            return  velocidadeAtual;
        }
        if (velocidadeAtual+acelerar <= 200) {
            velocidadeAtual =+ acelerar;
        }else {
            velocidadeAtual = 200;
        }
        return velocidadeAtual;
    }

    public int Frear(int freiar){
        if(velocidadeAtual-freiar > 0 ){
            velocidadeAtual =-freiar;
        }else{
            velocidadeAtual = 0;
        }
        return velocidadeAtual;
    }





}


