package Part2;

public class Methods {

    public static void main(String[] args) {
        int num1 = countOfCurrentWord("", "word");
        int num2 = countOfCurrentWord("A string string is an object that represents a number of character values");
        if (num1 == -2) {
            System.out.println("Current word is missing or the text is empty");
        } else if (num1 == -1) {
            System.out.println("No matches of the current word are found in the text");
        } else System.out.println("Current word repeats in the text " + num1 + " times");
        if (num2 == -2) {
            System.out.println("The text is empty");
        } else if (num2 == -1) {
            System.out.println("No matches of the word \"string\" are found in the text");
        } else System.out.println("A word \"string\" repeats in the text " + num2 + " times");
    }

    static int countOfCurrentWord(String first, String second) {
        String[] stringarr = first.split(" ");
        int count = 0;
        if (first.length() == 0 || second == null) {
            return -2;
        } else {
            for (int i = 0; i < stringarr.length; i++) {
                if (stringarr[i].equals(second)) {
                    count++;
                }
            }
            if (count == 0) return -1;
            return count;
        }
    }

    static int countOfCurrentWord(String oneParameter) {
        return countOfCurrentWord(oneParameter, "string");
        }
    }

