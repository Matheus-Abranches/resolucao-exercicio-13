import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //apartir de agr irei aplicar o uso de duas classes
        Scanner scanner = new Scanner(System.in);
        Condicao condicao = new Condicao();


        System.out.println("Me diga seu nome");
        String nome = scanner.next();
        System.out.println("me diga sua idade");
        int idade = scanner.nextInt();

        System.out.println(nome);
        condicao.funcaoDeCondicao(idade);

    }
}