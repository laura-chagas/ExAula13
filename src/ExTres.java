
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> notas = new ArrayList<>();

        int numIdent, nota, soma = 0;
        float medEx, medAp;

        System.out.println("Informe o número de identificação do aluno: ");
        numIdent = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a nota do aluno: ");
            notas.add(nota = sc.nextInt());
            soma += notas.get(i);

        }
        medEx = soma / 3;
        medAp = notas.get(0) + notas.get(1) * 2 + notas.get(2) * 3 + medEx / 7;

        //RESULTADOS

        System.out.println("Aluno: " + numIdent);

        System.out.println("NOTAS");

        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota: " + notas.get(i));
        }

        System.out.println("Media Exercicios: " + medEx);

        System.out.print("Media de Aproveitamento: ");
        if (medAp >= 90) {
            System.out.print("APROVADO");
        } else if (medAp >= 75 && medAp < 90) {
            System.out.print("APROVADO");
        } else if (medAp >= 60 && medAp < 75) {
            System.out.print("APROVADO");
        } else if (medAp >= 40 && medAp < 60) {
            System.out.print("REPROVADO");
        } else if (medAp < 40) {
            System.out.print("REPROVADO");
        } else {

            System.out.print("Error");

        }


    }
}
