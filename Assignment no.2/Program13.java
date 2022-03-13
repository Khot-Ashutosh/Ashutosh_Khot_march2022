import java.util.*;
class Program13
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the width: ");
		float b= s1.nextFloat();
		
		System.out.println("Enter the height: ");
		float h= s1.nextFloat();
		
		float A = b*h;
		System.out.println("Area: "+A);
		
		float P = 2*(b+h);
		System.out.println("Perimeter: "+P);
	}
	
}