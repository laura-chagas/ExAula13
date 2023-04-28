import java.util.Scanner;

/*Não consegui realizar*/

public class ExNove {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num[] = new int[50];

        for (int i = 1; i < num.length; i++) {
            num[0] = 101;
            num[i] = num[i]++;
            System.out.println(num[i]);
        }

    }
}
