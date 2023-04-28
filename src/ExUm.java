import java.util.Scanner;

public class ExUm {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int a, b, c;

            System.out.println("Informe um número: ");
            a = sc.nextInt();

            System.out.println("Informe um número: ");
            b = sc.nextInt();

            if (a == b){

                c = a + b;

                System.out.println("O resultado de A + B é respectivamente: " + c);

            } else{

                c = a * b;

                System.out.println("O resultado de A * B é respectivamente: " + c);
            }



    }
}