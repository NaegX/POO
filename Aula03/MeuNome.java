import java.util.Scanner;


public class MeuNome { 
    public static void main(Stings []args) {
    Scanner teclado = new Scanner(System.in);
    int Nascimento, ano , idade ;
    char nome ;

    System.out.println("Entre com seu nome :");
    nome = teclado.nextChar();

    System.out.println("Entre com o ano que nasceu :");
    Nascimento = teclado.nextInt();

    System.out.println("Entre com o ano atual :");
    ano = teclado.nextInt();

    idade = atual - Nascimento;

    System.out.println(nome + " , possui " + idade + " anos"  );
    }
}
