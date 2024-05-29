package ActionItem2;

public class Assignment_2 {
    public static void main(String[] args) {
        int grade = 75;
        if(grade >= 90 && grade <=100) {
            System.out.println("grade is A");
        }else if(grade >= 80 && grade < 90){
            System.out.println("grade is B");
        }else if(grade >= 70 && grade < 80){
            System.out.println("grade is C");
        }else if(grade >= 60 && grade < 70){
            System.out.println("grade is D");
        }else{
            System.out.println("grade is F");
        }//end of conditional
    }//end of main
}//end of class
