class Pattern13
{
	public static void main(String args[])
    {
		for(char i=65; i<=69; i++)
		{
			for(int j=i; j<69; j++)
			{
				System.out.print(" ");
			}
			for(int j=65; j<=i; j++)
			{	
				System.out.print(i+" ");
			}
			
			
			System.out.println();
		}
	}	
}