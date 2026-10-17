import java.util.Scanner;
public class NaturalNumber{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.println("---------Natural Numbers----------");
		System.out.print("Enter Number: ");
		int Number=in.nextInt();
		int i=1;
		while(i<=Number){
			System.out.println(i);
			i=i+1;
		}
	}
}