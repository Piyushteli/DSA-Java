import java.util.Scanner;
class Greatestnumber{
	public static void main(String [] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 1st Number: "); 
		int a=in.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b=in.nextInt();
		System.out.print("Enter 3rd Number: ");
		int c=in.nextInt();
		
		if (a>b && a>c){
			System.out.println(a+" is greatest Number ");
			}
		else if(b>c){
			System.out.println(b+" is greatest Number ");
			}
		else{
			System.out.println(c+" is greatest Number ");
			}
		}
}