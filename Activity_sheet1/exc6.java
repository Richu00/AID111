import java.util.Scanner;

public class exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if (i % 5 == 0) {
                count++;
            }
        } 
        System.out.print("Count = " + count);
    sc.close();

    } 
}