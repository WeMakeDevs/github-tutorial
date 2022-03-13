package CommunityClassroom;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three numbers");  //input of three numbers
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        System.out.println("Maximum: "+ max(num1, num2, num3));
        System.out.println("Minimum: " + min(num1, num2, num3));

        scn.close();
    }

    static int max(int a, int b, int c){    //method to find maximum

        if(a > b && a > c){
            return a;
        }

        return b > c? b:c;

    }
    static int min(int a, int b, int c){    //method to find minimum
        
        if(a < b && a < c){
            return a;
        }

        return b < c? b:c;
    }
}
