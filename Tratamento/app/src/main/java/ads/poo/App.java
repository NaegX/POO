/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.plaf.synth.SynthUI;

public class App {
    public static void main(String[] args) {    
    
    }
        public int lerTeclado(){
            Scanner teclado = new Scanner(System.in);
            do{
                try{
                    System.out.print("Entre com um número: ");
                    int num = teclado.nextInt();
                    return num; // se o número for lido corretamente, então retorne
                }catch(Exception e){
                    System.err.println("Erro: " + e.toString());
                }finally{
                    System.out.print("Sempre será executada");
                }
                System.out.print("Se o return for executado, então essa linha nunca será alcançada");
            }while(true);
    
}


}