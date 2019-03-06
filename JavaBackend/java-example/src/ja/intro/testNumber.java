package ja.intro;

import java.util.Scanner;

public class testNumber {
    public static void main(String[] args) {
        int a,b;
        Scanner type = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = type.nextInt();
        System.out.println("Enter b: ");
        b = type.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
