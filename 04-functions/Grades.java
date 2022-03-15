package CommunityClassroom;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        float marks = scn.nextFloat();  //input of marks from user
        System.out.println("Grade is " + grade(marks));

        scn.close();
    }

    static String grade(float mks){ //method to return grade based upon marks

        if(mks >90 && mks <=100){
            return "AA";
        }

        else if(mks >80 && mks <=90){
            return "AB";
        }

        else if(mks >70 && mks <=80){
            return "BB";
        }

        else if(mks >60 && mks <=70){
            return "BC";
        }

        else if(mks >50 && mks <=60){
            return "CD";
        }

        else if(mks >40 && mks <=50){
            return "DD";
        }

        else if(mks <= 40 ){
            return "Fail";
        }

        else {  //for marks greater than 100 
            return "Not Available";
        }
    }
}
