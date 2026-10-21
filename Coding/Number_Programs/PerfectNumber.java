import java.util.Scanner;
public class PerfectNumber{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Perfect Number Program =====");
		System.out.print("Enter Number: ");
		int Number=sc.nextInt();
		int i=1;
		int Sum=0;
		while(i<Number){
			if (Number%i==0){
				Sum=Sum+i;
			}
			i=i+1;
		}
		if (Sum==Number){
			System.out.println(Number+" is Perfect Number");
		}
		else{
			System.out.println(Number+" is Not Perfect Number");
		}
	}
}