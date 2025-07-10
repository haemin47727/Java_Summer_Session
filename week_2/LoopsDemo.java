package week_2;

public class LoopsDemo {
    public static void main(String[] args) {

        // finite iteration
        //for (initialize counter; boolean condition; incrementer)

//        for(int i = 100; i >= 0; i-=25){
//            System.out.println("i is currently: " + i);
//            i -=25;
//        }

        // non-finite iteration
        int count = 0;
        // while (boolean condition is true) -> loop
        while(count < 100){

            // make sure you have a way out
            count++;

            if (count == 50){
                // break out of the nearest loop (or switch statement)
                break;
            }

            if (count % 2 == 0){ // if count is even
                // forces an early iteration of the loop
                continue;
            }

            System.out.println("true count = " + count);
        }

//        count = 1;
//
//        // do-while loop ensures the body of the loop
//        // wille execute at least once
//        do {
//            System.out.println("count = " + count);
//            count++;
//        } while(count < 10);

        System.out.println("all done");
    }
}
