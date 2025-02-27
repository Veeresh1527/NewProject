import java.util.Scanner;
class UpperLowerSpecial 
{
	public static void main(String[] args) 
	{
		 try(Scanner s = new Scanner(System.in)) {
			System.out.println("Enter a character ch");
			char ch =s.next().charAt(0);
			
			if(ch=='a'){
			    System.out.println("abc");

			}else if(ch=='b'){
			    System.out.println("bcd");


			}
		}
	}
}
