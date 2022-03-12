package CommunityClassroom;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Choose any option from these\n1. Cone\n2. Prism\n3. Cylinder\n4. Sphere\n5. Pyramid\n\n");

        String option = scn.nextLine();             //stores an option from above list taken by user
        double volume;

        if(option.equals("Cone") || option.equals("cone") || option.equals("1")){

            System.out.println("Enter the value of radius");
            float radius = scn.nextFloat();

            System.out.println("Enter the value of height");
            float height = scn.nextFloat();

            volume = Math.PI * radius * radius * height * 1/3;
            System.out.println("Volume of Cone: " + volume);

        }


        else if(option.equals("Prism") || option.equals("prism") || option.equals("2")){

            System.out.println("Enter the value of base area");
            float baseArea = scn.nextFloat();

            System.out.println("Enter the value of height");
            float height = scn.nextFloat();

            volume = baseArea * height;
            System.out.println("Volume of Prism: " + volume);

        }


        else if(option.equals("Cylinder") || option.equals("cylinder") || option.equals("3")){

            System.out.println("Enter the value of radius");
            float radius = scn.nextFloat();

            System.out.println("Enter the value of height");
            float height = scn.nextFloat();

            volume = Math.PI * radius * radius * height;
            System.out.println("Volume of Cylinder: " + volume);

        }


        else if(option.equals("Sphere") || option.equals("sphere") || option.equals("4")){

            System.out.println("Enter the value of radius");
            float radius = scn.nextFloat();

            volume = Math.PI * radius * radius * radius * 4/3;
            System.out.println("Volume of Sphere: " + volume);

        }


        else if(option.equals("Pyramid") || option.equals("pyramid") || option.equals("5")){

            System.out.println("Enter the value of base area");
            float baseArea = scn.nextFloat();

            System.out.println("Enter the value of height");
            float height = scn.nextFloat();

            volume = baseArea * height * 1/3;
            System.out.println("Volume of Pyramid: " + volume);

        }

         // for option not in list print invalid option chosen
        else {
            System.out.println("Invalid option chosen");
        }

        scn.close();
    }
}
