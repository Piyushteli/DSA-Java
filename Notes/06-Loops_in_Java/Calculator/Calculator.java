import java.util.Scanner;
public class Calculator{
	public static void main(String [] args){
	int Ans=0;
	while(true){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Operator: ");
		char Operator=in.next().charAt(0);
		
		if (Operator=='+'||Operator=='-'||Operator=='*'||Operator=='/'||Operator=='%'){
			System.out.println("-------Take two Numbers --------");
			System.out.print("Enter First Number:");
			int num1=in.nextInt();
			//System.out.println();
			System.out.print("Enter Second Number: ");
			int num2=in.nextInt();
			if (Operator=='+'){
				Ans=num1+num2;
			}
			if (Operator =='-'){
				Ans=num1-num2;
			}
			if (Operator=='*'){
				Ans=num1*num2;
			}
			if (Operator=='/'){
				if (num2!=0){
				Ans=num1/num2;
				}
			}
			if (Operator=='%') {
				Ans=num1%num2;
			}
			}
		else if (Operator=='X'||Operator=='x'){
			break;
			}
		else{
			System.out.println("Invalid Input");
		}
		System.out.println("Result: "+Ans);
		}
	}

 }