import java.util.Scanner;
public class CountDigits{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Count Digits =====");
		System.out.print("Enter Number: ");
		int Number=sc.nextInt();
		int Count=0;
		while(Number!=0){
			int digit=Number%10;
			Count=Count+1;
			Number=Number/10;
			}
		System.out.println("Count OF Digits: "+Count);
		}
}