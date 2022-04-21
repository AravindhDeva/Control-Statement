package fibonacciseries;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1 ;
		int n1= 0;
		int n2 = 1;
		System.out.print("First" +n+ "terms : ");
		while (i<=n)
		{
			System.out.print(n1 +" +");
			int sum = n1+n2;
			n1=n2;
			n2=sum;
			i++;
			
		}
		
		System.out.println("abcd");
	}

}
