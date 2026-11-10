package Homework.java;

import java.util.Stack;

public class BraceChecker {


        private String text;

        public BraceChecker(String text) {
            this.text = text;
        }

        public void check() {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < text.length(); i++) {
                char current = text.charAt(i);

                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else if (current == ')' || current == ']' || current == '}') {

                    if (stack.empty()) {
                        System.out.println("Error: closing " + current + " at " + i);
                        return;
                    }

                    char opened = stack.pop();

                    if ((opened == '(' && current != ')') ||
                            (opened == '[' && current != ']') ||
                            (opened == '{' && current != '}')) {

                        System.out.println("Error: opened " + opened +
                                " but closed " + current + " at " + i);
                        return;
                    }
                }
            }

            if (!stack.empty()) {
                System.out.println("Error: opened " + stack.pop() + " but not closed");
            } else {
                System.out.println("No errors");
            }
        }
}
