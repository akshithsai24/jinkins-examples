import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter your Roll Number : ");
		String roll = sc.nextLine();
		System.out.println("Enter your Branch : ");
		String brach = sc.nextLine();
		
		System.out.println("Your Have Entered : ");
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+roll);
		System.out.println("Branch : "+brach);
		
		
	}
}
