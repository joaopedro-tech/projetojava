import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        
        System.out.println("Informe seu nome:");
        pessoa.setNome(sc.nextLine());
        
        System.out.println("Informe sua idade:");
        pessoa.setIdade(sc.nextInt());

        sc.close();

        String mensagem = String.format("Olá, %s. Seja bem vindo! Sua idade é: %d", pessoa.nome, pessoa.idade);
        System.out.println(mensagem);
    }
}
