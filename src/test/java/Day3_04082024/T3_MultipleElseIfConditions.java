package Day3_04082024;

public class T3_MultipleElseIfConditions {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        int c = 6;

        if(a+b>c){
            System.out.println("A and B are greater than C ");
        }else if(b+b==c){
            System.out.println("A and B are equal to C");
        }else{
            System.out.println("Both statements are false and this is one is true ");
        }//end of else if statement
    }//end of main
}//end of class
