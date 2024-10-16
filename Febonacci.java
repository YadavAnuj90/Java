package Loops;
import java.util.Scanner;

public class Febonacci {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a= 0;
        int b = 1;
        int count = 2;

        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }

        while (count <= n) {
             int temp = b ;
             b = b + a;
             a  = temp ;
             count ++;

        }
         System.out.println(b);
     }


}
