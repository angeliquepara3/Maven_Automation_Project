package PracticeFolder;

import java.util.ArrayList;

public class Class_Practice {
    public static void main(String[] args){
    //declare arraylist variable
    ArrayList<String> cities = new ArrayList<>();
    //add some values to the countries
    cities.add("USA"); //index 0
    cities.add("Canada"); //index 1
    cities.add("Greece"); //index 2
    cities.add("India"); //index 3
    cities.add("Mexico"); //index 4
    cities.add("Bahamas"); //index 5

    //loops
    for(int i = 0; i<cities.size(); i++){
        //print
        System.out.println("The cities are " + cities.get(i));
    }//end of loop





    }//end of main
}//end of class
