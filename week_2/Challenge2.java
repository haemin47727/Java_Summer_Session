package week_2;

public class Challenge2 {

    // Print whether each number from 1 to 20 is even or odd using a `for` loop.

    public static void main(String[] args) {

        for(int i = 1; i < 21; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
