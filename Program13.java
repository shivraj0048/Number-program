import java.util.Scanner;   
class Program13
{
   public static void main(String[] arg)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any no:");
     int num=sc.nextInt();
     int rev=0;
     for(int i=num;i>=1;i/=10)
     {
     	int rem=i%10;
     	rev=rev*10+rem;
     }
    System.out.println(rev+"the reverse no");
   }
}