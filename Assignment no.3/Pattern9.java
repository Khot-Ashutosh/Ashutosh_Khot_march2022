class Pattern9
{
	public static void main(String args [])
	{
		for(int i=65;i<=69;i++)
		{
			for(char j=68;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(char k=65;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}