/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import ads.poo.produtos.Celular;
import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        // Telefone tel = new Telefone(12564, "123356ad", "fixo" , 1.56 , new Dimensao(2,5,6));
        // Telefone telsemfio = new SemFio(25468, "121545sa65s", "semfio", 1.0, new Dimensao(4,5,6) , 3.4, 14, 5000);
    
        // System.out.println(tel.imprimirDados());
        // System.out.println(telsemfio.imprimirDados());

        // Telefone t = null;
        // SemFio s = null;
        // Celular c = null;
        // Celular d = null;

        // t = new Celular(123, "1564as", "movel", 156,new Dimensao(4,5,6) ,1.44, 20, 1000, "Android");
        // c = new Celular(123, "1564as", "movel", 156,new Dimensao(4,5,6) ,1.44, 20, 1000, "Android");

        // // c.setSistemaOperacional("iOS");

        // // ((Celular) t).setSistemaOperacional("ubuntu");

        // d = (Celular) t ;
        // t = d ;

        Telefone[] t = new Telefone[4];

        t[0] = new Telefone(123, "1564as", "movel", 156,new Dimensao(4,5,6));
        t[1] = new Celular(123, "1564as", "movel", 156,new Dimensao(4,5,6) ,1.44, 20, 1000, "Android");
        t[2] = new Celular(123, "1564as", "movel", 156,new Dimensao(4,5,6) ,1.44, 20, 1000, "Android");
        t[3] = new SemFio(123, "1564as", "movel", 156,new Dimensao(4,5,6) ,1.44, 20, 1000);
    
        for(Telefone tel : t){
            System.out.println(tel.imprimirDados());

            if (tel instanceof Celular) {
                System.out.println(((Celular) tel).getSistemaOperacional());
            }
        }
        
    
    
    
    
    
    
    
    
    }
}
