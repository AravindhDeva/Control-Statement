package amgstrongnumber;

public class AmgstrongNumber {
public static void main(String[] args) {
	System.out.println("Enter a number ");
	int i =153;
	int temp = i ;
	int r,sum=0;
	while (i>0)
	{
		r= i%10;
		i= i/10;
		sum = sum + r*r*r;
		
	}
	if(temp == sum )
	System.out.println(" Entered Number is Amstrong Number");
	else
		System.out.println("Enterd Number is not Amstrong Number");
		
}
}
