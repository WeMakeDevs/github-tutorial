package CommunityClassroom;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int age = scn.nextInt();    //input of age from user
        System.out.println("Candidate is " + eligibility(age));

        scn.close();
    }

    static String eligibility(int ageValue){    //method to determine voting eligibility of candidate

        return ageValue >= 18 ? "Eligible to Vote":"Not Eligible to Vote";
    }
}
