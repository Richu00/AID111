
import java.util.Scanner;

public class exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired number");
       int num = sc.nextInt();
        if (num > 0){
            System.out.println("the number is a positive");
        } else if (num < 0) {
            System.out.println("the number is a negative");
        } else {
            System.out.println("the number is 0");
        } sc.close();
    }
}