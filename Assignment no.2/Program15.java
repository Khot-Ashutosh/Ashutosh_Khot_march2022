import java.util.*;
class Program15
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the n1: ");
		int n1= s1.nextInt();
		
		System.out.println("Enter the n2: ");
		int n2= s1.nextInt();
		
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		
		
	}
	
}