
import java.util.Scanner;

public class exc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Choose operator 1.+, 2.-, 3.*, 4./ " );
        int choice = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        switch(choice) {
            case 1: 
                System.out.println(num1 + num2);
                break;
            case 2: 
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Error wrong input");
        } sc.close();
    }
}