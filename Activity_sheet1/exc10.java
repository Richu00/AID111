import java.util.Scanner;

public class exc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int tempnum = num;
        int pallin = 0;
        while (tempnum > 0) {
            int digit = tempnum % 10;
            pallin = pallin * 10 + digit;
            tempnum /= 10;
        } 
        if (pallin == num) {
            System.out.println(num + " is a pallindrome");
        }
        else {
            System.out.println(num + " is not a pallindrome");
        }
        sc.close();
    }
}