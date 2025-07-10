package week_2;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // dynamically sized - you don't have to indicate size
        // when creating - unlike arrays
        // dynamically sized is a great thing
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("world");
        words.add("!!!");
        System.out.println(words.get(0));

        if (words.isEmpty()){
            System.out.println("the list is empty");
        }

        if (words.contains("world")){
            System.out.println("words contains world");
        }

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(123);
        int num = nums.get(0);

        String numStr = "one";
        int example = Integer.parseInt(numStr);
        System.out.println(example);

        String[] wordsArray = new String[10];
        System.out.println(wordsArray[0]);

        wordsArray[0] = "hello";
        wordsArray[1] = "world";
        wordsArray[2] = "!!!";

        boolean empty = true;
        for (int i = 0; i <= wordsArray.length; i++){
            if (null != wordsArray[i]){
                empty = false;
            }
        }

        for (String word : wordsArray){
            if (word.equalsIgnoreCase("world")){
                System.out.println("contains world");
            }
        }
    }
}
