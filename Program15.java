import java.util.Scanner;   
class Program15
{
   public static void main(String[] arg)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enetr the minit");
     int min=(new Scanner(System.in)).nextInt();
     System.out.println("min:"+min);
     int minyear=365*24*60;
     System.out.println("one minit in 1year:"+minyear);
     int year=min/minyear;
     System.out.println(year);
     int day=(min%minyear)/(24*60);
     System.out.println(year+":year  "+day+":day");
   }
}