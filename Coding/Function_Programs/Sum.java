import java.util.Scanner;
public class Sum{
	public static void main(String [] args){
		Sum();
	}

	static void Sum(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Value a: ");
		int a=in.nextInt();
		System.out.print("Enter Value b: ");
		int b=in.nextInt();
		int Sum=a+b;
		System.out.println("Sum : "+Sum);
		}
	}