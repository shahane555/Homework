package homework;

public class Reverse {
    public static void main(String[] args) {
        String str = "Goris has beautiful nature";
        String[] str2 = sentenceReverse(str);
        String[] result = new String[str2.length];
        for (int i = 0; i < str2.length; i++) {
            result[i] = wordReverse(str2[i]);
            System.out.print(result[i] + " ");
        }
    }

    public static String[] sentenceReverse(String str) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static String wordReverse(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }
        return String.valueOf(ch);
    }
}
