package ActionItems1;

import java.util.ArrayList;

public class ActionItem_Assignment2 {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> region = new ArrayList<>();
        //add some values to the countries array list
        region.add("Bay Ridge"); //index 0
        region.add("Dyker Heights"); //index 1
        region.add("Downtown Brooklyn"); //index 2
        region.add("Bensonhurst"); //index 3
        ArrayList<Integer> areaCode = new ArrayList<>();
        //add some values to the countries array list
        areaCode.add(718); //index 0
        areaCode.add(212); //index 1
        areaCode.add(347); //index 2
        areaCode.add(917); //index 3
        //print out all the regions using a for loop
        for(int i = 0; i < region.size(); i++) {
            //print out which index is at
            System.out.println("My region is " + region.get(i) + " and my area code is " + areaCode.get(i));
        }//end of for loop
    }//end of main
}//end of class
