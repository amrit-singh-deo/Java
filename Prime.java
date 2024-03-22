import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                flag ++;
            }
        }

        if(flag == 2){
            System.out.println(num + " is a Prime Number");
        }
        else{
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}
