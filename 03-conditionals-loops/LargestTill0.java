package CommunityClassroom;

import java.util.Scanner;

public class LargestTill0 {
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        int max = Integer.MIN_VALUE;    //stores minimum integer value

        while(true){    //runs till input is 0
            
            int num = scn.nextInt();//take inputs

            if(num == 0){ //if input is 0, come out of the loop
                break;
            }

            if(num > max){  //find the max value
                max = num;
            } 
        }

        System.out.println(max);//print the maximum of numbers
        scn.close();
    }
}
