package dynamicArray;

public class MyList {
    private Student[] arr;
    private int size;

    public MyList() {
        arr = new Student[3];
        size = 0;
    }

    public void doubleArraySize() {
        Student[] arr1 = new Student[arr.length * 2];
        for (int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;
    }

    public void add(Student obj) {
        try {
            arr[size] = obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            doubleArraySize();
            arr[size] = obj;
        }
        size++;
    }

    public void add(int index, Student obj) {
        size = index;
        add(obj);
    }

    public Student get(int index) {
        return arr[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            try {
                arr[i] = arr[i + 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                doubleArraySize();
                arr[i] = arr[i + 1];
            }
        }
    }

    public int size() {
        return size;
    }
}



