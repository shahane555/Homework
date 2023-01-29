package Part1;

public class
Trapezoid {

    public static void main(String[] args) {
//      1st task
        int c;
        int a = 55;
        int b = 24;
        c = a * a + b * b;
        System.out.println("c = a²+ b² = " + c);
        System.out.println();

//        2nd task
        a = 5; //top basis of the trapezoid
        b = 9; //bottom basis of the trapezoid
        c = 7; //height of the trapezoid
        int area = (a + b) / 2 * c; //area of trapezoid
        System.out.println("Area of the trapezoid is " + area + " cm²");
        System.out.println();

//        3rd task
        int number = 354;
        int thirdDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        number = number / 10;
        int firstDigit = number;
        System.out.println("All digits of the current number are");
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);


        byte b1 = 100;
        byte c1 =26;
        byte y = (byte) (b1 + c1);
        System.out.println(y);
        double d = 5.2;
        System.out.println((double) (5/2));
        System.out.println(d/2);


    }
}