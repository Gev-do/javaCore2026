public class Example {
    class IfSample {
        public static void main(String[] args) {
            int x, у;
            x = 10;
            у = 20;

            if(x < у) System.out.println("x < у");

            x = x * 2;
            if(x ==у) System.out.println("x = у");

            x = x * 2;
            if(x >у) System.out.println("x теперь больше у");

            if(x ==у) System.out.println("we cant see this :)");
        }
    }

}
