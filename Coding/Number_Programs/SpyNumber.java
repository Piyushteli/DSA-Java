import java.util.Scanner;
public class SpyNumber{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Spy Number =====");
		System.out.print("Enter Number: ");
		int Number=sc.nextInt();
		int Sum=0;
		int Mul=1;
		while(Number!=0){
			int digit=Number%10;
			Sum=Sum+digit;
			Mul=Mul*digit;
			Number=Number/10;
			}
		if (Sum==Mul){
			System.out.println("Number is Spy Number");
			}
		else  System.out.println("Number is Not Spy Number");
		}
}