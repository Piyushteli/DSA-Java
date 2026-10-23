import java.util.Scanner;
public class Reverse{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Reverse Number =====");
		System.out.print("Enter Number: ");
		int Number=sc.nextInt();
		int Rev=0;
		while(Number!=0){
			int digit=Number%10;
			Rev=digit+Rev*10;
			Number=Number/10;
		} 
		System.out.println("Reverse Number: "+Rev);
	}
}