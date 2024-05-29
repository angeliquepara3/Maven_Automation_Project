package PracticeFolder;

import java.util.ArrayList;

public class While_Loop_Review {
    public static void main(String[] args) {
        //declare an ArrayList
        ArrayList<String> countries = new ArrayList<>();
        //add values to ArrayList
        countries.add("USA");
        countries.add("India");
        countries.add("Canada");
        countries.add("Uganda");
        countries.add("Nigeria");
        //declare and define while loop
        int i=0;
        while (i< countries.size()){
            System.out.println("My current country is " + countries.get(0));
            i=i+1;
        }//end of loop

    }//end of main
}//end of class
