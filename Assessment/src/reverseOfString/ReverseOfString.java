package reverseOfString;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		//String str1[]=new String[l];
		char str1[]=str.toCharArray();
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
		

	}

}
