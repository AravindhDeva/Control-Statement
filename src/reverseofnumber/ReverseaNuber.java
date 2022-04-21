package reverseofnumber;

import java.util.Scanner;

public class ReverseaNuber {
	public static void main(String[] args) {
		System.out.println(" Enter a number to Reverse");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int rev = 0;
		while (num!=0)
		{
			int digit=num%10;
			rev = rev*10 + digit;
			num/=10;
			
		}
		
		System.out.println(" Reverse number is : " +rev);
	}

}
