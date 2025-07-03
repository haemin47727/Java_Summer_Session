package week_3;

public class MethodsDemo {

    public static void main(String[] args) {
        String[] wordsArray = new String[3];
        System.out.println(wordsArray[0]);

        wordsArray[0] = "hello";
        wordsArray[1] = "world";
        wordsArray[2] = "!!!";

        for (String word : wordsArray){
            if (word.equalsIgnoreCase("world")){
                System.out.println("contains world");
            }
        }

        String[] wordsArray2 = new String[3];

        wordsArray2[0] = "oregon";
        wordsArray2[1] = "washington";
        wordsArray2[2] = "california";

        contains(wordsArray2, "nevada");
        contains(wordsArray2, "arizona");
        contains(wordsArray2, "oregon");
        contains(wordsArray2, "india");

        sayHelloFiveTimes();

        int val = multiplyFiveTime(3, 87);
    }

    public static void contains(String[] arr, String word){

        for (String w : arr){
            if (w.equalsIgnoreCase(word)){
                System.out.println("this array contains " + word);
                return;
            }
        }

        System.out.println("not found");

    }

    public static void sayHelloFiveTimes(){
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");
        System.out.println("hello!");
    }

    public static int multiplyFiveTime(int a, int b){
        int result = a * b * a * b * a * b * a * b * a * b;
        return result;
    }
}
