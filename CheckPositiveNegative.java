import java.util.Scanner;
class   CheckPositiveNegative
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n value");
		int n =sc.nextInt();
		if(n>0){
			System.out.println("Positive Number");
			if(n%2==0){
				System.out.println("Even");
			    }
			else{
				System.out.println("Odd");
			    }
		}
		else{
			System.out.println("Negative Number");
		    }
	}
}
