import java.util.Scanner;

 public class exc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                sum += i;
            } 
        }
        System.out.print("Sum of even numbers till " + num + " is " + sum);
        sc.close();
    }
 }