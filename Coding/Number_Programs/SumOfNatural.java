import java.util.Scanner;
public class SumOfNatural{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int Number=in.nextInt();
		int i=1;
		int Sum=0;
		while(i<=Number){
			Sum=Sum+i;
			i=i+1;
		}
		System.out.println("The Sum of Numbers is "+Sum);
	}
}