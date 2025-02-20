import java.util.Scanner;   
class Program18
{
   public static void main(String[] arg)
   {
     int a=1;
     int b=5;
     int c=3;
    // System.out.println((a>b||a>c)?(a+"a is big"):((b>a||b>c)?(b+"b is big"):((c>a||c>b)?(c+"c is big"):("not big"))));
     int largest=((a>b)?((a>c)?(a):(c)):((b>c)?(b):(c)));
     System.out.println("the largest no:"+largest);
   }
}