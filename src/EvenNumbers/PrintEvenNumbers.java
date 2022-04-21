package EvenNumbers;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		System.out.println("Even Numbers from 1-100 are ");
		for (int i=1; i<=100; i++) {
			if(i % 2== 0) {
				System.out.println(i);
			}
		}
	}

}
