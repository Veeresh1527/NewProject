import java.util.Scanner;
class  Detailsofstudent
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter age");
		int age= sc.nextInt();
		System.out.println("Enter Gender");
		char ch= sc.next().charAt(0);
		System.out.println("Enter Student id");
		long id = sc.nextLong();
	    System.out.println("Enter Marks");
		int Marks = sc.nextInt();
		System.out.println("Enter mobileno");
		long num = sc.nextLong();
		 System.out.println("Name:"+name);
		 System.out.println("Age:"+age);
		 System.out.println("Gender:"+ch);
		 System.out.println("S-Id:"+id);
		 System.out.println("Marks:"+Marks);
		 System.out.println("mobileNo:"+num);
	}
}
