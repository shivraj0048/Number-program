import java.util.Scanner;   
class Program21
{
   public static void main(String[] arg)
   {
        int num=(new Scanner(System.in)).nextInt();
        System.out.println((num%2!=0||num%3!=0||num%5!=0||num%7!=0)?(num+"number is prime"):(num+"num is not prime"));
   }
}