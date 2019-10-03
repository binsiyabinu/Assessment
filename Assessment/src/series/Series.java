/*Write a java program to print the following series! Given an integer n.
 *  Print n-1 lines of the following series 1 2 4 3 6 9 4 8 12 16 5 10 15 20 25
Input format:

The input consist of Integer



Output format:

The output consists of Integer



Sample Input:

3



Sample Output:

1 2 4*/



package series;
import java.util.Scanner;
import java.lang.*;
class Series
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int res=i*j;
				System.out.println(res);
			}
		}
	}
}
				
 