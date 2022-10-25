public class Conditionals {
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolean expressions T or F) {
        //body
        } else {
        //do this
        }
         */

//        System.out.println("Please enter your salary: ");
//        Scanner input = new Scanner(System.in);
//        int salary = input.nextInt();
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        //multiple if-else
        int salary = 2000;
        if (salary >= 20000){
            salary += 3000;
        } else if (salary >= 10000) {
            salary += 2000;
        } else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}