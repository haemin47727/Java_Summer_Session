package week_1;

public class TypeCastingDemo {

    public static void main(String[] args) {

        // type casting

        // widening conversions (implicit)
        byte b = 4; // 8 bits
        short s = b; // 16 bits


        // narrowing conversion - possible loss of precision
        byte b2 = (byte) s;

        short s2 = 3453;

        // narrowing conversion
        int i = s2; // a short fits into an int (implicit conversion)

        // need to explicitly cast this int "i" into the short "s2"
        s2 = (short) i;

        long l = 122344l;
        float f = l;


        System.out.println(s);

    }

}
