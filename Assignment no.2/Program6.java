import java.util.Scanner;
class Program6
{
	public static void main( String args[] )
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int n1= s.nextInt();
		System.out.println("Enter the number2: ");
		int n2= s.nextInt();
		
		int n3=n1+n2;
		System.out.println("Result= "+n3);
		
		int n4=n1-n2;
		System.out.println("Result= "+n4);
		
		int n5=n1*n2;
		System.out.println("Result= "+n5);
		
		int n6=n1/n2;
		System.out.println("Result= "+n6);
		
		int n7=n1%n2;
		System.out.println("Result= "+n7);
		
	}
}