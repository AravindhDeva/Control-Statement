package palindrome;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter a number to find Palindrome or Not ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int j=0, n = i;
		 while (n > 0)
		 {
			int rev = n %10;
			n = n/10;
			j=(10*j)+rev;
		 }
			if (j==i) {
				System.out.println("Entered number is Palindrome");
			} else {
System.out.println("Entered number is not Palindrome");
s.close();
			}
			
		}
		
		
		

	}


