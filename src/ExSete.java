import java.util.Scanner;

public class ExSete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        int n;


        System.out.println("Informe seu nome: ");
        nome = sc.next();

        System.out.println("Informe um número: ");
        n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println(nome);
        }


    }
}
