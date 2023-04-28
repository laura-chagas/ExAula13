import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int numCont, num, soma = 0;

        System.out.println("Quantos números você vai inserir? ");
        numCont = sc.nextInt();

        for (int i = 0; i < numCont; i++) {

            System.out.println("Informe um número");
            numeros.add(sc.nextInt());

            if (numeros.get(i) > 0) {

                soma += numeros.get(i);


            } else {
                break;
            }


        }



    }
}
