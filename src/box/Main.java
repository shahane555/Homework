package box;

public class Main {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>(9);
        Box<Double> d = new Box<>(55.5);
        Box<Float> f = new Box<>(29.9F);
        Box<Long> l = new Box<>(79L);
        System.out.println(Box.sum(i, d));
        System.out.println(Box.sum(l, f));
    }
}
