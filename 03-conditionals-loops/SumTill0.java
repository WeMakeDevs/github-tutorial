package CommunityClassroom;

import java.util.Scanner;

public class SumTill0 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        long sum = 0;

        while(true){    //runs till input is 0
            
            int num = scn.nextInt();//take inputs

            if(num == 0){ //if input is 0, come out of the loop
                break;
            }

            sum += num; //sum them
        }

        System.out.println(sum);//print the sum of numbers
        scn.close();
    }
}
