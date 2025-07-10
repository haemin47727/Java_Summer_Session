package week_2;

public class ArraysDemo {

    public static void main(String[] args) {

        // create empty array
        int[] nums = new int[5];

        // populate array
        nums[4] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[0] = 50;

        // array indices start at zero
        System.out.println(nums[5]);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " - ");
        }

        System.out.println();

        // another way to declare an array
        int[] vals = {12, 34, 56, 78};

        System.out.println(vals[2]);

        // final loop to learn - for-each
        for(int trex : vals){ System.out.print(trex + " - ");}
        // create array of size 3
        char[] characters = new char[3];

        characters[0] = 'z'; // put "z" in index 0
        characters[1] = 'm'; // put "m" in index 1
        characters[2] = 'w'; // put "w" in index 2

        System.out.println(characters[1]);

        if (characters[0] == 'z') {
            //...
            if (10 > 8){
                // ...
            } else {
                // ...
            }
        } else if (characters[0] == 'm'){
            // ..
        }
    }
}
