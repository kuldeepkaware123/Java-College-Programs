// Program to Check Entered Number Perfect or Not 

import java.util.Scanner;

public class Check_Num {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is Perfect Number ");
        } else {
            System.out.println(num + " is not Perfect Number ");
        }
    }
}