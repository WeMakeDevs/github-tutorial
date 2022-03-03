package CommunityClassroom;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();    // taking an input from user
        long temp = n, res = n;
        int digitsCount = 0;

        while(temp > 0){        //finding count of digits

            digitsCount ++;
            temp /= 10;

        }

        long result = 0;

        while(n > 0){   // finding sum of digits with each digit raised to power of number of digits available

            int dig =(int) n % 10;
            result += Math.pow(dig, digitsCount);
            n /= 10;

        }
        if (res == result){ //if input number is same as the processed number then armstrong
             System.out.println("Armstrong");
        }

        else{   //otherwise not armstrong
            System.out.println("Not Armstrong");
        }

        scn.close();
    }
}
