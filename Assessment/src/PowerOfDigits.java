import java.util.Scanner;
import java.lang.Math;
public class PowerOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int n=num%10;
		num=num/10;
		while(num>0)
		{
			
			double power=Math.pow((num%10),n);
			sum=(int) (sum+power);
			n=num%10;
			num=num/10;
			
		}
      System.out.println(sum+1);
     // System.out.println(Math.pow(2,3));
	}

}
