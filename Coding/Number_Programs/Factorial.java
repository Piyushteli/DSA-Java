import java.util.Scanner;
public class Factorial{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.println("====== Factorial Program ======");
		System.out.print("Enter the Number: ");
		int Number=in.nextInt();
		int i=1;
		int Fact=1;
		while(i<=Number){
			Fact=Fact*i;
			i=i+1;
		}
		System.out.println("The Factorial is "+Fact);
	}
}