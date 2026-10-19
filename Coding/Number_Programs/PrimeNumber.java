import java.util.Scanner;
public class PrimeNumber{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("===== Prime Number =====");
		System.out.print("Enter Number : ");
		int Number=sc.nextInt();
		int i=1;
		int Count=0;
		while(i<=Number){
			if (Number%i==0){
				Count=Count+1;
			}
			i=i+1;
		}
		if(Count==2){
			System.out.println(Number+" is Prime Number");
		}
		else{
		System.out.println(Number+" is not Prime Number");
		}
	}
}