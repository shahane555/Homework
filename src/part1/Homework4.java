package part1;

public class Homework4 {


    public static void main(String[] args) {
        //____________1st___________
        int x = 31;
        int y = 7;
        int z = x / y;

        if (x == y * z) {
            System.out.println(" 'x is divided by y without reminder' assumption is" + " " + true);
        } else {
            System.out.println(false);
        }

        //____________2nd_____________
        double d1 = 79.125;
        double d2 = d1 - (int) d1;
        System.out.println(d2);
        System.out.println();

        //____________3rd_____________

        int a, b, c, d, e, f;
        a = 29;
        b = 25;
        c = 14;
        d = 3;
        e = 133;
        f = 9;
        double average1 = (a + b + c) / 3;
        double average2 = (double) (d + e + f) / 3;
        int sum = (int) (average1 + average2);
        System.out.println("The arithmetic average of a, b, c is" + " " + average1);
        System.out.println("The arithmetic average of d, e, f is" + " " + average2);
        System.out.println("The integer part of the sum is " + " " + sum);
    }
}

