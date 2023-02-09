package part2;

public class CharArray {
    public static void main(String[] args) {
        int[] intArr = charToInt('a', '4', 'k', 'K');
        char[] charArr = intToChar(97, 52, 107, 75);
        System.out.println("ASCII codes of the characters below are ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
        System.out.println("Corresponding characters of the ASCII codes below are ");
        for (int i = 0; i < charArr.length; i++)
            System.out.print(charArr[i] + " ");
    }


    static int[] charToInt(char... c) {
        int[] arr = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            arr[i] = c[i];
        }
        return arr;
    }

    static char[] intToChar(int... c) {
        char[] arr = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            arr[i] = (char) c[i];
        }
        return arr;
    }
}