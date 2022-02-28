package CommunityClassroom;

import java.util.Scanner;

public class RsToUSD {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        double rupees = scn.nextDouble();   // taking input of rupees
        double usd = 0.0132 * rupees;    // converting to usd

        System.out.println(usd);    //printing usd

        scn.close();

    }
}
