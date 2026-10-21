import java.util.Scanner;
public class ExtractDigits{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Extract Digits =====");
		System.out.print("Enter Number: ");
		int Number=sc.nextInt();
		while(Number!=0){
			int digit=Number%10;
			System.out.println(digit);
			Number=Number/10;
			}
		}
}