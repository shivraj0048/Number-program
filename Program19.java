import java.util.Scanner;   
class Program19
{
   public static void main(String[] arg)
   {
     int a=1;
     int b=2;
     int c=5;
     int smollest=((a<b)?((a<c)?(a):(c)):((b<c)?(b):(c)));
     System.out.println("the smollest no is:"smollest);
   }
}