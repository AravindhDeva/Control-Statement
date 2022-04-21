package countthenumber;

public class CountNumbers {
public static void main(String[] args) {
	System.out.println(" Enterd number to Count");
	int num = 123;
	int count = 0;
	while (num!=0) {
		num = num/10;
		count++;
		
	}
	System.out.println(count);
}
}
