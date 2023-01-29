package Part2;

public class Exponent {
    public static void main(String[] args) {
        double c = exponent(4, -2);
        System.out.println("c = " + c);
    }

    static double exponent(int a, int b) {
        if (a > 10 || -a > 10 || b > 10 || -b > 10) {
            return -1;
        } else if (a < 0) {
            return -2;
        } else {
            double mult = 1;
            for (int i = 0; i < b; i++) {
                mult *= a;
            }
            for (int i = 0; i < -b; i++) {
                mult *= (double) 1 / a;
            }
            return mult;
        }
    }
}

