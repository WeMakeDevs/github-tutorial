package CommunityClassroom;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter any three numbers");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        System.out.println("Triplet is " + pythaTriplet(n1,n2,n3));

        scn.close();
    }

    static String pythaTriplet(int a, int b, int c){    //method to determine whether inputted triplet is pythagorean triplet or not

        if(a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b){
            return "a Pythagorean Triplet";
        }

        return "Not a pythagorean Triplet";

    }
}
