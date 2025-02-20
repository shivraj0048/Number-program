import java.util.Scanner;
class Swap2
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("entetr the value of a:");
	   int a=sc.nextInt();
	  System.out.println("enter the value of b:");
	   int b=sc.nextInt();
	   int temp;
	   temp=a;
	   a=b;
	   b=temp;
	   System.out.println("reverse a:"+a);
	   System.out.println("reverse b:"+b);

	}
}