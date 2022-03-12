package CommunityClassroom;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose any option from these\n1. Circle\n2. Equilateral Triangle\n3. Parallelogram\n4. Rectangle\n5. Square\n6. Rhombus\n\n");

        String option = scn.nextLine();             //stores an option from above list
        double perimeter;

        if(option.equals("Circle") || option.equals("circle") || option.equals("1")){

            System.out.println("Enter the value of radius");
            float radius = scn.nextFloat();

            perimeter = 2* Math.PI * radius;
            System.out.println("Perimeter of Circle: " + perimeter);
        }


        else if(option.equals("Equilateral Triangle") || option.equals("equilateral triangle") || option.equals("2")){

            System.out.println("Enter the value of side");
            float side = scn.nextFloat();

            perimeter = 3 * side;
            System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
        }


        else if(option.equals("Parallelogram") || option.equals("parallelogram") || option.equals("3") || option.equals("Rectangle") || option.equals("rectangle") || option.equals("4") ){

            System.out.println("Enter value of 1st side");
            float side1 = scn.nextFloat();

            System.out.println("Enter value of 2nd side");
            float side2 = scn.nextFloat();

            perimeter = 2 * (side1 + side2);
            System.out.println("Perimeter of Parallelogram/ Rectangle: " + perimeter);
        }


        else if(option.equals("Square") || option.equals("square") || option.equals("5")|| option.equals("Rhombus") || option.equals("rhombus") || option.equals("6")){

            System.out.println("Enter value of side");
            float side = scn.nextFloat();

            perimeter = 4 * side;
            System.out.println("Perimeter of Square/Rhombus: " + perimeter);
        }

        // for option not in list print invalid option chosen
        else{
            System.out.println("Invalid option chosen");
        }

        scn.close();
    }
}
