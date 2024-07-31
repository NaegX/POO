package ads.poo;

public class App {
    public static void main(String[] args) {
       
        // Disciplina poo = new Disciplina("POO", new DiasDaSemana[]{DiasDaSemana.TER, DiasDaSemana.SEX});
        // System.out.println(poo);

        // DiasDaSemana d = DiasDaSemana.DOM;
        
        // System.out.println(d.getCodigo());

        //Sigla: POO
        //Dias:
        // -terça-feira
        // -sexta-feira


        //Sigla: POO
        //Dias: ter,sex

        for (Naipe c : Naipe.values()){
            System.out.println(c);
        }

        Baralho b = Baralho.AS;
        System.out.println(b.getExtenso()); 
    }
}
