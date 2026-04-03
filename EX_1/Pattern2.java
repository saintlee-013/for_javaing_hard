class Pattern2
{
	public static void main(String args[])
	{
		char ch='A',temp;
		for (int i=1; i<=4; i++)
		{
			for (int space=4; space>i; space--)
				System.out.print(" ");
			temp= (char)(ch+i-1);
			for (int j=1; j<=i; j++)
				System.out.print(temp--);
			ch+=i;
			System.out.println();

		}
	}
}