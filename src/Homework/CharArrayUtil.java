package Homework;

public class CharArrayUtil {


        public static void main(String[] args) {

            char[] chars = {
                    'J', 'a', 'v', 'a', ' ',
                    'i', 's', ' ', 'f', 'u', 'n', '!'
            };


            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();

            System.out.println("Characters count: " + chars.length);
            System.out.println("First character: " + chars[0]);
            System.out.println("Last character: " + chars[chars.length - 1]);


            char c = 'a';
            int charCount = 0;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == c) {
                    charCount++;
                }
            }

            System.out.println("Character '" + c + "' count: " + charCount);


            int vowels = 0;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'a' || chars[i] == 'e' ||
                        chars[i] == 'i' || chars[i] == 'o' ||
                        chars[i] == 'u' || chars[i] == 'A' ||
                        chars[i] == 'E' || chars[i] == 'I' ||
                        chars[i] == 'O' || chars[i] == 'U') {
                    vowels++;
                }
            }

            System.out.println("Vowels count: " + vowels);


            int consonants = 0;

            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];

                if ((ch >= 'a' && ch <= 'z') ||
                        (ch >= 'A' && ch <= 'Z')) {
                    if (ch != 'a' && ch != 'e' && ch != 'i' &&
                            ch != 'o' && ch != 'u' && ch != 'A' &&
                            ch != 'E' && ch != 'I' && ch != 'O' &&
                            ch != 'U') {
                        consonants++;
                    }
                }
            }

            System.out.println("Consonants count: " + consonants);


            int spaces = 0;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') {
                    spaces++;
                }
            }

            System.out.println("Spaces count: " + spaces);


            char[] reversed = new char[chars.length];

            for (int i = 0; i < chars.length; i++) {
                reversed[i] = chars[i];
            }

            for (int i = 0; i < reversed.length / 2; i++) {
                char temp = reversed[i];
                reversed[i] = reversed[reversed.length - 1 - i];
                reversed[reversed.length - 1 - i] = temp;
            }

            System.out.print("Reversed: ");
            for (int i = 0; i < reversed.length; i++) {
                System.out.print(reversed[i]);
            }
            System.out.println();


            char[] upper = new char[chars.length];
            char[] lower = new char[chars.length];

            for (int i = 0; i < chars.length; i++) {
                upper[i] = chars[i];
                lower[i] = chars[i];

                if (upper[i] >= 'a' && upper[i] <= 'z') {
                    upper[i] = (char) (upper[i] - 32);
                }

                if (lower[i] >= 'A' && lower[i] <= 'Z') {
                    lower[i] = (char) (lower[i] + 32);
                }
            }

            System.out.print("Uppercase: ");
            for (int i = 0; i < upper.length; i++) {
                System.out.print(upper[i]);
            }
            System.out.println();

            System.out.print("Lowercase: ");
            for (int i = 0; i < lower.length; i++) {
                System.out.print(lower[i]);
            }
            System.out.println();


            char oldChar = 'a';
            char newChar = '*';
            char[] replaced = new char[chars.length];

            for (int i = 0; i < chars.length; i++) {
                replaced[i] = chars[i];

                if (replaced[i] == oldChar) {
                    replaced[i] = newChar;
                }
            }

            System.out.print("Replaced: ");
            for (int i = 0; i < replaced.length; i++) {
                System.out.print(replaced[i]);
            }
            System.out.println();


            char[] palindrome = {'l', 'e', 'v', 'e', 'l'};
            boolean isPalindrome = true;

            for (int i = 0; i < palindrome.length / 2; i++) {
                if (palindrome[i] != palindrome[palindrome.length - 1 - i]) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is palindrome: " + isPalindrome);


            char target = 'a';
            int firstIndex = -1;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == target) {
                    firstIndex = i;
                    break;
                }
            }

            System.out.println("First index: " + firstIndex);


            char[] first = {'J', 'a', 'v', 'a'};
            char[] second = {'J', 'a', 'v', 'a'};
            boolean equal = first.length == second.length;

            if (equal) {
                for (int i = 0; i < first.length; i++) {
                    if (first[i] != second[i]) {
                        equal = false;
                        break;
                    }
                }
            }

            System.out.println("Arrays are equal: " + equal);

            char[] unique = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

            for (int i = 0; i < unique.length; i++) {
                boolean found = false;

                for (int j = 0; j < i; j++) {
                    if (unique[i] == unique[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.print(unique[i] + " ");
                }
            }
        }
    }

