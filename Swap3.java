import java.util.Scanner;
class Swap3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the valaue of a:");
        int a=sc.nextInt();
        System.out.println("enetr the value of b:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the reverse value of a:"+a);
        System.out.println("the reverse value of b :"+b);		
	}
}