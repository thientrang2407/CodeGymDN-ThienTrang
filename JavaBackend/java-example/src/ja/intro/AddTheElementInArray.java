package ja.intro;

import java.util.Scanner;

public class AddTheElementInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 0, 0, 0, 0};
        int numbersSize = numbers.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter the index of this number");
        int index = scanner.nextInt();

        if (index <= 1 || index >= numbersSize) {
            System.out.println("Can not add this number in the list");
        } else {
            for (int i = numbersSize - 1; i > index; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[index] = inputNumber;
            AddTheElementInArray.showIntArr(numbers);
        }

    }

    public static void showIntArr(int[] arr) {
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }
}
