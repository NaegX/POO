package ads.poo;

import java.util.ArrayList;

public class AppLivraria {

    public static void main(String[] args){
        
        
        ArrayList<Autor>canada = new ArrayList<>();
        ArrayList<Autor>america = new ArrayList<>();
        ArrayList<Livro>livraria = new ArrayList<>();
    
        Autor william = new Autor("William P. Young", "Canadense");
        Autor veronica = new Autor("Veronica Roth", "Americana");

        canada.add(william);
        america.add(veronica);
        

        Livro a = new Livro("A Cabana", 100.00, "1234567891234", canada);
        Livro b = new Livro("Divergente", 100.00, "5847958461254", america);


        livraria.add(a);
        livraria.add(b);
        livraria.add(new Livro("A Travessia", 100.00, "5847958461255", canada));

        System.out.println(livraria);

    }
    
}
