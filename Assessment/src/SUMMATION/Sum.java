/*Write a java program to expand the series: (1) + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n) if n is given. The value of n should be an integer.
Input format:

The input consist of Integer



Output format:

The output consists of Integer



Sample Input:

4



Sample Output:

20*/


package SUMMATION;

import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int res=(i*(i+1))/2;
			sum=sum+res;
		}
		System.out.println(sum);
	}
}