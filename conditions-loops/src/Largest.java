import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q. Find the largest of the three number.
//        int large_number = a;
//        if (b > large_number){
//            large_number = b;
//        }
//        if (c > large_number){
//            large_number = c;
//        }
//        System.out.println(large_number);
//        int max = 0;
//        if (a > b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}
