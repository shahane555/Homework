package collection;

public class StringsReverse {
    public static void main(String[] args) {
        String str = "A collection is an object that represents a group of objects";
        String[] st = str.split(" ");
        for (String s : st) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length / 2; i++) {
                char temp = ch[i];
                ch[i] = ch[ch.length - 1 - i];
                ch[ch.length - 1 - i] = temp;
            }
            String reversed = String.valueOf(ch);
            System.out.print(reversed + " ");
        }
    }
}