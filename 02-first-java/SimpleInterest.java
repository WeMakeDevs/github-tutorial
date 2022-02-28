package CommunityClassroom;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Principal amount in Rs");
        double principal = scn.nextDouble(); 

        System.out.println("Enter Rate per annum ");
        float rate = scn.nextFloat();

        System.out.println("Enter time in years");
        int time = scn.nextInt();

        double simpleInterest = principal * rate * time / 100 ;     //calclating Simple Interest

        System.out.println("Simple Interest is " + simpleInterest); // Printing simple interest

        scn.close();


    }
}
