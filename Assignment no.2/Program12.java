import java.util.*;
class Program12
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int n1 = s1.nextInt();
		
		System.out.println("Enter the number2: ");
		int n2 = s1.nextInt();
		
		System.out.println("Enter the number3: ");
		int n3 = s1.nextInt();
		
		int avg = (n1+n2+n3)/3;
		System.out.println("Average= "+avg);
		
		
	}
	
}