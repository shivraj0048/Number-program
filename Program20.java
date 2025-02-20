import java.util.Scanner;   
class Program20
{
   public static void main(String[] arg)
   {
     int num=999;
     int rem=0;
     int product=1;
     for(int i=num;i>=1;i/=10)
     {
     	rem=i%10;
        product=product*rem;
     }
     System.out.println("the product is"+product);

   }
}