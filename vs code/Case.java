import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter n value");
            int n = s.nextInt();

           switch (n) {
           
                case 1:
                 { System.out.println("One");}
           break;
                 case 2:
                 { System.out.println("One");}
                 case 3:
                 { System.out.println("One");}
                 case 4:
                 { System.out.println("One");}
                 case 5:
                 { System.out.println("One");}
                default:
                 { System.out.println("Invalid Data");}
                // Although not strictly necessary for the default case, it's good practice
            }
        }
    }
}

