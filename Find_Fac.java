//Find The Factorial of Given Number

import java.util.Scanner;

public class Find_Fac {
    public static void main(String ar[]) {

        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int num = sc.nextInt();
        for (int i = 1, step = 1; i <= num; i++, step++) {

            if (num % step == 0) {
                System.out.println(step + " ");
            }
            fact *= step;

        }
        System.out.println("Factorial is : " + fact);
    }
}