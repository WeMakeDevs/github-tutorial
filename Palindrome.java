package CommunityClassroom;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        String input = scn.nextLine().trim();   //  taking input of string
        String reverse = "";    //string to store the reverse of inputted spring

        for(int i = 0 ; i < input.length(); i++ ){  //  for each character, adds it in reverse mmanner to reverse string

            reverse = input.charAt(i) + reverse;
        }

        if(input.equals(reverse)){
            System.out.println("Palindrome"); //    if the string and reverse are same then palindrome
        }

        else {
            System.out.print("Not Palindrome"); // if both are not same then not palindrome
        }

        scn.close();
    }
}
