import java.util.Scanner;
public class EvenNatural{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.println("=====Even Natural Number=====");
		System.out.print("Enter Number: ");
		int Number=in.nextInt();
		int i=1;
		while(i<=Number){
			if(i%2==0){
				System.out.println(i);
			}
			i=i+1;
			}
		}
}