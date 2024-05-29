package PracticeFolder;

public class SplitCommand {
    public static void main (String[] args){
        //declare a string message
        String message = "Welcome back Arisha";
        //declare an array
        String[] splitMessageArray = message.split(" ");
        //print out Arisha
        System.out.println(splitMessageArray[2]);
    }//end of main
}//end of class
