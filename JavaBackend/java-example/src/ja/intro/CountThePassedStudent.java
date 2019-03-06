package ja.intro;

import java.util.Scanner;

public class CountThePassedStudent {
    static int size;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }

        }while (size > 30) ;

        int[] myList = inputScore();

        showTheList(myList);
    }
    public static int [] inputScore() {
        Scanner scanner = new Scanner(System.in);
        int[] myList = new int[size];
        int i = 0;
        while (i < myList.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            myList[i] = scanner.nextInt();
            i++;
        }
        return myList;
    }
    public static void showTheList(int []myList ){
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < myList.length; j++) {
            System.out.print(myList[j] + "\t");
            if (myList[j] >= 5 && myList[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);

    }
}

