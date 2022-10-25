import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Vinal Pawar");
            case 2 -> System.out.println("Suyog Nimje");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "SDE" -> System.out.println("Software Development");
                    case "Management" -> System.out.println("Manager");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }


        switch (empID) {
            case 1:
                System.out.println("Vinal Pawar");
                break;
            case 2:
                System.out.println("Ishita Bhandari");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "SDE":
                        System.out.println("Software Development");
                        break;
                    case "Management":
                        System.out.println("Manager");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}
