import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) throws Exception {
        //instanciar variaveis
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        String profissao;

        //processamento
        System.out.println("Bem vindo ao Selfcare, seu aplicativo de cuidados, por favor informe seu nome:");
        nome = sc.nextLine();
        System.out.println("qual sua idade?");
        idade = sc.nextInt();
        System.out.println("qual sua profissao?");
        sc.nextLine();
        profissao = sc.nextLine();

        //saida
        System.out.println("seus dados estão corretos?");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("profissao: " + profissao);
        
        sc.close();
    }
}
