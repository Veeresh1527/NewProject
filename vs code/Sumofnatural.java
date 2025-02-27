import java.util.Scanner;
public class Sumofnatural {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
            System.out.println("Enter a value");
            int a =sc.nextInt();
            int sum =0;
            for(int i = 1;i<=a;i++){
                sum = sum+i;
            }
            System.out.println(sum);
        }

    }

