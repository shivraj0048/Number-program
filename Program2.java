import java.util.Scanner;   
class Program2
{
   public static void main(String[] arg)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no:");
     int num=sc.nextInt();
     System.out.println(((num/2)==(num/2.0))?(num+":the given no is even"):(num+":the given no is odd"));
     

   }
}