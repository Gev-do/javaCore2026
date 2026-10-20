package Homework;

public class ArraySortingHomework {

        public static void main(String[] args) {

            int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};


            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }

            System.out.println("Ascending order:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

            // Restore original array for Problem 2
            int[] original = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = original[i];
            }


            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }

            System.out.println("\nDescending order:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

