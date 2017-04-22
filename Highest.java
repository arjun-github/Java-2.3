import java.util.Scanner;
public class Highest {


	static int a;
	static int b;
	static int c;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter three values");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		if( a>b)
		{
			if(a>c)
		
		System.out.println(a+" is the highest");
		}
		
		else if(c>b)
		System.out.println(c+" is the highest");
		
		else
			System.out.println(b+" is the highest");
	}
}
	