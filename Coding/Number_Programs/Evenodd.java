import java.util.Scanner;
class Evenodd{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int Number=in.nextInt();
		if (Number%2==0){
			System.out.println("Even Number");
			}
		else{
			System.out.println("odd Number");
		}

	}
}