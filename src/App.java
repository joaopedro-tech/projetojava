import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
 
        System.out.println("Informe seu nome:");
        pessoa.setNome(sc.nextLine());
        
        System.out.println("Informe o dia de nascimento:");
        pessoa.setDia(sc.nextInt());

        System.out.println("Informe o mês de nascimento:");
        pessoa.setMes(sc.nextInt());

        System.out.println("Informe o ano de nascimento:");
        pessoa.setAno(sc.nextInt());

        sc.close();

        int diasDeVida = pessoa.getDiasDeVida();
        System.out.println("Dias de vida: " + diasDeVida);
        System.out.println("Sua idade é: " + pessoa.getAnosVividos());
    }
}
