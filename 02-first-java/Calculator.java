package CommunityClassroom;

import java.util.*;

public class Calculator {
    
public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    
    while(true){// take input and perform operations until x or X is pressed
        
        System.out.println("\nEnter an operator");  // Input a character
        char operator = scn.next().trim().charAt(0);

        // if inputted character is matched to a calculator operator

        if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){ 

            int result = Integer.MIN_VALUE; // taking min integer value as default, chosen randomly by me

            System.out.println("Enter two numbers"); //take input of two numbers
            int a = scn.nextInt();
            int b = scn.nextInt();

            // perform the desired operation according to the operator

            if(operator =='+'){
                result = a + b;
            }

            else if(operator =='-'){
                result = a - b;
            }

            else if(operator =='*'){
                result = a * b;
            }

            else if(operator =='%'){
                result = a % b;
            }

            else {
                if(b != 0){ //   for division denominator shouldn't be 0
                    result = a/b;
                }
            }

            System.out.println("Result: " + result); // printing the result after each operation
        }

        else if (operator == 'x' || operator == 'X'){ // if operator is x or X stop taking input of operator 
            break;
        }

        else {
            System.out.println("Invalid Operator"); //  for any other invalid operator
            }
        }

        scn.close();
    }
}

