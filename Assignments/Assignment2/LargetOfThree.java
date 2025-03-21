import java.util.Scanner;
public class LargetOfThree 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max;
		max=(a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	    System.out.println("The largest number is: "+max);
		
		
		
		
		
}
		
		
}