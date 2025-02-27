import java.util.Scanner;

public class CharExample {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ch value:");
        char ch = sc.next().charAt(0); // Correct way to read a single character

        switch (ch) {
            case 'a' ->  {
                System.out.println("Apple");
            }
            case 'b' ->  {
                System.out.println("Ball");
            }
            case 'c' ->  {
                System.out.println("Invalid data");
            }
            default ->  {
                System.out.println("Invalid character");
            }
        }
    }
}

      

