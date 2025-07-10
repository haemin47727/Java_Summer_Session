package week_3;

import java.util.ArrayList;

public class DogPack {

    // instance variables
    private ArrayList<Dog> dogs = new ArrayList<>();

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {

        System.out.println("*** printing dog pack *** ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < dogs.size(); i++){
            sb.append(dogs.get(i).getName())
                    .append(" is ")
                    .append(dogs.get(i).getAge())
                    .append(" years old")
                    .append("\n");
        }

        return sb.toString();
    }
}
