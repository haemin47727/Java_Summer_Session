package week_1;

public class OperatorsDemo {
    public static void main(String[] args) {

        // arithmetic operators
            // +, -, /, *, %

        byte a = 4;
        byte b = 11;
        int c = b + a;
        System.out.println("c = " + c);

        if (b % 2 == 0){
            System.out.println("the value is even");
        }

        // relational operators
            // >, >=, <, <=, ==, !=
            // "!" means "not"

        if (a != b){
            System.out.println("a != b");
        }


        // logical operators
            // &, &&, |, ||, ^

        if (a < b ^ b < 20){
            System.out.println("a > b & b < 20");
        }
    }
}
