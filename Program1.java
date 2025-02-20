import java.util.Scanner;   
class Program1
{
   public static void main(String[] arg)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no:");
     int num=sc.nextInt();
     System.out.println((num%2==0)?(num+":given no is even"):(num+":given no is odd"));
   }
}