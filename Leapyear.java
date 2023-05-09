import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter The Year : ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
            System.out.println(y + " is Leap Year");

        } else {
            System.out.println(y + " is not Leap Year");

        }
    }
}
