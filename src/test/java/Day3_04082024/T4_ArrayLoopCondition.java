package Day3_04082024;

public class T4_ArrayLoopCondition {
    public static void main(String[] args) {
        //we use the .equals operator to compare string variables
        //we use == operator to compare integers
        String[] fruits;
        //declare values for variable fruits
        fruits=new String[]{"Apple","Orange", "Grape", "Strawberry","Mango"};
        //only print out if the fruit is Mango or Grape
        for(int i=0; i< fruits.length; i++){
            if(fruits[i].equals("Mango")){
                System.out.println("Fruit is " + fruits[i]);
            }//end of
        else if(fruits[i].equals("Grape")){
        System.out.println("Fruit is " + fruits[i]);
            }//end of if else
        }//end of loop
    }//end of main

}//end of class
