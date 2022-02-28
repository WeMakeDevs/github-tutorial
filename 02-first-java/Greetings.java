package CommunityClassroom;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine().trim(); // taking input of name
        System.out.println("Glad to see you " + name ); // printing greeting for that name

        scn.close();
    }
}
