package CommunityClassroom;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        float rds = scn.nextFloat();    //take input from user
        System.out.println("The area of circle is " + area(rds));
        System.out.println("The circumference of circle is " + circumference(rds));

        scn.close();
    }

    static double area(float radius){   //method to find area

        return Math.PI* radius * radius;
    }

    static double circumference(float radius){  //method to find circumference
        
        return Math.PI* 2 * radius;
    }
}
