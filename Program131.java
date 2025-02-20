import java.util.Scanner;   
class Program131
{
   public static void main(String[] arg)
   {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int sum=0;

     for(int i=num;i>=1;i/=10)
     {
         int rem=i%10;
         sum=sum+rem;
         System.out.println(rem+" : "+sum);
     }
     System.out.println("the sum of digit is:"+sum);
   }
}