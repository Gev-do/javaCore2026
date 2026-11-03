package Homework.dynamicarray;

public class DynamicArrayDemo {
        public static void main(String[] args) {

            DynamicArray da = new DynamicArray();


            System.out.println("Test 1:");

            for (int i = 1; i <= 5; i++) {
                da.add(i * 5);
            }

            da.print();


            System.out.println("Test 2:");

            DynamicArray da2 = new DynamicArray();

            for (int i = 1; i <= 15; i++) {
                da2.add(i);
            }

            da2.print();


            System.out.println("Test 3:");

            DynamicArray da3 = new DynamicArray();

            for (int i = 1; i <= 25; i++) {
                da3.add(i);
            }

            da3.print();


            System.out.println("Test 4:");

            System.out.println(da3.getByIndex(0));
            System.out.println(da3.getByIndex(24));
            System.out.println(da3.getByIndex(-1));
            System.out.println(da3.getByIndex(30));


            DynamicArray da4 = new DynamicArray();

            System.out.println(da4.getByIndex(0));
        }
    }