import java.util.*;
class Program7
{
	public static void main( String args[])
	{
		Scanner sc= new Scanner( System.in);
		System.out.println("Enter the number");
		int n1= sc.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			int j=n1*i;
			System.out.println(n1+"*"+i+"="+j);
		}
	}
}