import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous_number = 0;
        int current_number = 1;
        int count = 2;

        while(count <= n){
            int temp = current_number;
            current_number = current_number + previous_number;
            previous_number = temp;
            count++;
        }
        System.out.println(current_number);
    }
}
