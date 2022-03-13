import java.util.*;
class Program11
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		double r= s1.nextDouble();
		final double Pi=3.14159;
		
		double P=2*Pi*r;
		System.out.println("Perimeter= "+P);
		
		double A=(Pi*r*r);
		System.out.println("Area= "+A);
		
	}
	
}