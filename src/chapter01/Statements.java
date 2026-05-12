package chapter01;

public class Statements {
    public static void main(String[] args) {

        // do something. Statements: declarations, assignments, method calls, etc.
        int x = 3;
        String name = "Marcus";
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();

        // this is a comment

        // do something again and again. Loops: for and while

        while (x > 12) {
            x = x - 1;
        }

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("i is now " + 1);
        }

        // do something under this condition. branching: if/else tests

        if (x == 10) {
            System.out.println("x must be 10");
        }
        else {
            System.out.println("x isn't 10");
        }

        if ((x < 3) && (name.equals("Marcus"))) {
            System.out.println("Gently");
        }

        System.out.println("this line runs no matter what");
    }
}
