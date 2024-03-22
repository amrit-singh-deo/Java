import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range: ");
        int start = sc.nextInt();
        System.out.println("Enter end range: ");
        int end = sc.nextInt();
        int flag = 0;
        System.out.println("Prime Numbers in the given range: ");
        for (int i = start; i <= end; i++) {
            flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }

            if (flag == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
