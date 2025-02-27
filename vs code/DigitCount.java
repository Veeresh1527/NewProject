import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);{
            int n =s.nextInt();
            int c =0;
            while(n!=0){
                n/=10;
                c++;
            }
            System.out.println(c);
        }
    }
}
