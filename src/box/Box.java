package box;

public class Box<T> {
    private T property;

    public Box(T property) {
        this.property = property;
    }

    static int sum(Box<? extends Number> ob1, Box<? extends Number> ob2) {
        return ob1.property.intValue() + ob2.property.intValue();
    }
}

