import java.util.Scanner;

public class exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
        } 
        if (sum % 2 == 0) {
            System.out.println(num + " is a special number");
        }
        else {
            System.out.println(num + " is not a special number");
        } 
        sc.close();
    }
}