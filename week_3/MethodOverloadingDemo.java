package week_3;

public class MethodOverloadingDemo {

    public static void main(String[] args) {
        int val = square(23);
        double val2 = square(12.34);

        System.out.println(12);
        System.out.println(12.34);
        System.out.println("hello");
    }

    public static int square(int x) {
        return x * x;
    }

    public static double square(double x) {
        return x * x;
    }

}
