package ActionItem2;

import java.util.ArrayList;

public class Assign1 {
    public static void main(String[] args) {
        //declare an ArrayList
        ArrayList<String> countries = new ArrayList<>();
        //add values to ArrayList
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("UK");
        countries.add("Egypt");
        //declare and define while loop
        int i=0;
        while (i< countries.size()){
            if(countries.get(i).equals("USA")){
                System.out.println("My country is " + countries.get(i));
            }//end of if statement
            else if(countries.get(i).equals("Bangladesh")){
                System.out.println("My country is " + countries.get(i));
            }// end of else if statement
           i=i+1;
            }//end of loop

    }//end of main
}//end of class
