
import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount");
        int bill = sc.nextInt();
        if (bill > 1000){
            System.out.println("You are applicable for discount");
        } else {
            System.out.println("You are not eligible for discount");
        } sc.close();
    }
}