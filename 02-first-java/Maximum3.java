package CommunityClassroom;

import java.util.*;

public class Maximum3 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();  // taking input of 3 numbers
        int b = scn.nextInt();
        int c = scn.nextInt(); 

        int max = a;    // assuming a to be maximum

        if (b > max){   // if b is greater than max then maximum is b
            max = b;
        }

        if (c > max){   // if c is greater than max then maximum is c
            max = c;
        }

        System.out.println("The maximum is: " + max);   //print the maximum

        scn.close();
    }
}
