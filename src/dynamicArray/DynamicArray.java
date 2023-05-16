package dynamicArray;

public class DynamicArray {
    public static void main(String[] args) {

        MyList list = new MyList();
        list.add(new Student("Anna", 18));
        list.add(new Student("Arman", 20));
        list.add(2, new Student("Sona", 21));
        list.add(new Student("Karen", 19));
        list.remove(2);
        for(int i = 0; i < list.size(); i++)
        System.out.println(list.get(i));
    }
}

