import java.util.Scanner;
class   MarriageEligibility
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Gender");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the Age");
		int age =sc.nextInt();
		if(ch=='M'||ch=='m'){
		System.out.println("Male");
		                    }
		if(age>=25){
			System.out.println("Eligible for Marriage");
		           }
		else{
			System.out.println("Not Eligible for Marriage");
		}
			if(ch=='F'||ch=='f'){
				System.out.println("Female");
			                    }
		if(age>=21){
			System.out.println("Eligible for Marriage");
		           }
		else{
			System.out.println("Not Eligible for Marriage");
		    }
	}
}


