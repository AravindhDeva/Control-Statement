package OddNumbers;

public class SumofOddNumbers {
	public static void main(String[] args) {
	
		int num=0;
		for(int i =1; i<=100; i++)
			if(i%2 !=0)
				num = num+i;
		System.out.println("Sum of odd numbers between 1-100 is" +num);
		
	}
	}


