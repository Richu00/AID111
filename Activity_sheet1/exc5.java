
import java.util.Scanner;
public class exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int num1 =  sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("Number 1 is the greatest number");
        } 
        else(num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is the greatest");
        } 
        else {
            System.out.print("Number 3 is the greatest");
        } 
        sc.close();
    }
}