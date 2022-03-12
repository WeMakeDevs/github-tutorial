package CommunityClassroom;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an option:\n1. Circle \n2. Triangle \n3. Rectangle \n4. Isoceles Triangle \n5. Parallelogram \n6. Rhombus \n7. Equilateral Triangle");
        String option = scn.nextLine();
        double area;

        if(option.equals("Circle")){

            System.out.println("Enter the radius of circle");
            float radius  = scn.nextFloat();

            area = Math.PI * radius * radius;
            System.out.println("Area of circle: " +  area);

        }

        else if(option.equals("Triangle")){
            
            System.out.println("Enter the base of right handed triangle");
            float base  = scn.nextFloat();

            System.out.println("Enter the height of right handed triangle");
            float height  = scn.nextFloat();

            area =  base * height * 1/2;
            System.out.println("Area of Triangle: " +  area);

        }

        else if(option.equals("Rectangle")){
         
            System.out.println("Enter the length of rectangle");
            float length  = scn.nextFloat();

            System.out.println("Enter the breadth of rectangle");
            float breadth  = scn.nextFloat();

            area = length * breadth;
            System.out.println("Area of Rectangle: " +  area);
        }

        else if(option.equals("Isoceles Triangle")){
            
            System.out.println("Enter side1 value");
            float side1  = scn.nextFloat();

            System.out.println("Enter side2 value");
            float side2  = scn.nextFloat();

            if(side1 > (side2/2)){

                area = side2 * Math.sqrt(4 * side1 * side1 - side2 * side2 ) * 1/4;
            }

            else {
                area = 1/4 * side1 * Math.sqrt(4 * side2 * side2 - side1 * side1 );
            }
            System.out.println("Area of Triangle: " +  area);
        }

        else if(option.equals("Parallelogram")){
            
            System.out.println("Enter base value");
            float base  = scn.nextFloat();

            System.out.println("Enter height value");
            float height  = scn.nextFloat();

            area = base * height;
            System.out.println("Area of Parallelogram: " +  area);
        }

        else if(option.equals("Rhombus")){
            
            System.out.println("Enter diagonal1 value");
            float d1  = scn.nextFloat();

            System.out.println("Enter diagonal2 value");
            float d2  = scn.nextFloat();

            area = d1 * d2 * 1/2;
            System.out.println("Area of Rhombus: " +  area);

        }

        else if(option.equals("Equilateral Triangle")){
            
            System.out.println("Enter the value of side");
            float side = scn.nextFloat();

            area = Math.sqrt(3) * 1/4 * side * side;
            System.out.println("Area of Equilateral Triangle: " +  area);            
        }

        else {
            System.out.println("Invalid Option chosen");
        }

        scn.close();
    }
}
