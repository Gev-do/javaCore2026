package Homework;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("First element: " + numbers[0]);


        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println("Array length: " + numbers.length);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);

        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 == 1) {
            System.out.println("Middle element: " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Middle elements: "
                    + numbers[numbers.length / 2 - 1] + " "
                    + numbers[numbers.length / 2]);
        }


        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);


        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddCount);


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);


        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);


        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);


        int positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
