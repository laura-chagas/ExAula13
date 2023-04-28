import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> idades = new ArrayList<>();

        int idade;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            idades.add(idade);
        }

        System.out.println("As idades digitadas foram: " + idades);



        int total = 0;
        for (int i = 0; i < idades.size(); i++) {
            total += idades.get(i);
        }
        System.out.println("Total da soma das idades: " + total);

        System.out.println("-------------------------------");

        double media;
        media = total / idades.size();
        System.out.println("A média das idades é: " + media);
    }
}
