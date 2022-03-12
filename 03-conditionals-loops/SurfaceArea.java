package CommunityClassroom;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Choose any option from these\n1. Curved Surface Area of Cylinder\n2. Total Surface Area of Cube\n\n");

        String option = scn.nextLine();             //stores an option from above list taken by user
        double surfaceArea;


        if(option.equals("Curved Surface Area of Cylinder") || option.equals("1")){

            System.out.println("Enter the value of radius");
            float radius = scn.nextFloat();

            System.out.println("Enter the value of height");
            float height = scn.nextFloat();

            surfaceArea = 2 * Math.PI * radius * (height + radius);
            System.out.println("Curved Surface Area of Cylinder: " + surfaceArea);
        }


        else if(option.equals("Total Surface Area of Cube") || option.equals("2")){

            System.out.println("Enter the value of side");
            float side = scn.nextFloat();

            surfaceArea = 6 * side * side;
            System.out.println("Total Surface Area of Cube: " + surfaceArea);
        }

        
         // for option not in list print invalid option chosen
         else {
            System.out.println("Invalid option chosen");
        }

        scn.close();
    }
}
