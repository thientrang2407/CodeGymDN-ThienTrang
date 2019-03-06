package ja.intro;

import java.util.Scanner;

public class TestVoidMethod {
    public static void main(String[] args) {
        double score ;
        Scanner printGrade = new Scanner(System.in);
        System.out.println("Enter your score");
        score = printGrade.nextDouble();
        printGrade(score);
    }

    public static void printGrade(double score){
        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
