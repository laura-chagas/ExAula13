import java.util.Scanner;
public class ExCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vNum[] = new int[20];

        for (int i = 0; i < vNum.length; i++) {

            System.out.println("Informe um número: ");
            vNum[i] = sc.nextInt();

        }


        for (int i = 0; i < vNum.length; i++) {

            if (vNum[i] >= 0 && vNum[i]<=100){

                System.out.println(vNum[i]);
            }

        }


    }
}
