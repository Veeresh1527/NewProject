import java.util.Scanner;
class UpperLowerSpecial 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a character ch");
		char ch =sc.next().charAt(0);
		if((ch>='A')&&(ch<='Z')){
			System.out.println("The Given char is Upper case");
		}
		else if((ch>='a')&&(ch<='z'))
			{
				System.out.println("The Given char is Lower case");
		}
		else if(!(ch>='1')&&(ch<='9'))
			{
				System.out.println("The Given char is Special Char");
		}
	}
}
