import java.util.Scanner;
class Program2
{
	public static void main( String args[] )
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int n1= s.nextInt();
		System.out.println("Enter the number2: ");
		int n2= s.nextInt();
		
		int n3=n1+n2;
		System.out.println("Sum= "+n3);
		
		
	}
}