import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> salario = new ArrayList<>();

        int num;

        System.out.println("Quantos salários serão inseridos?");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("Informe o salário");
            salario.add(sc.nextDouble());

        }

        double reaj;

        System.out.println("Informe a porcentagem de reajuste: ");
        double porcent = sc.nextDouble();

        List<Double> salarioAt = new ArrayList<>();

        System.out.println("SALARIOS ATUALIZADOS");
        for (int i = 0; i < salario.size(); i++) {

            reaj= (salario.get(i)*porcent) /100 + salario.get(i);

            salarioAt.add(reaj);

            System.out.println(salarioAt.get(i));
        }


    }
}
