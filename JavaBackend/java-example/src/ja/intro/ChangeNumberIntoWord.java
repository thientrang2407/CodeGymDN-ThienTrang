package ja.intro;

import java.util.Scanner;

public class ChangeNumberIntoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int number = sc.nextInt();
        String numberToWord;
        switch (number) {
            case 1:
                System.out.print(number + " is one.");
                break;
            case 2:
                System.out.print(number + " is two.");
                break;
            case 3:
                System.out.print(number + " is three.");
                break;
            case 4:
                System.out.print(number + " is four.");
                break;
            case 5:
                System.out.print(number + " is five.");
                break;
            case 6:
                System.out.print(number + " is six.");
                break;
            case 7:
                System.out.print(number + " is seven.");
                break;
            case 8:
                System.out.print(number + " is eight.");
                break;
            case 9:
                System.out.print(number + " is nine.");
                break;
            case 0:
                System.out.print(number + " is zero.");
                break;
            default:
                numberToWord = "Out of ability";
                if (numberToWord != "") {
                    System.out.printf("The number %d is called %s. ", number, numberToWord);
                } else {
                    System.out.print("Out of ability");
                }
        }
    }
}

