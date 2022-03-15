package CommunityClassroom;

import java.util.Scanner;

public class PalindomeFn {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();    //take input of a number
        System.out.println("The inputted number is "+ palindrome(num));

        scn.close();
    }

    static String palindrome(int n){    //method to find whether inputted number is palindrome or not

        int temp = n;
        int dig;
        int result = 0;

        while(n > 0 ){

            dig = n% 10;    //extract digit from n
            result = result * 10 + dig; //create reverse of n by reversing its digits
            n /= 10;    //remove the processed digit
        }

        return temp == result ? "Palindrome":"Not Palindrome";  //if the result is same as initial number then return palindrome else not palindrome
    }
}
