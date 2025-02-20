import java.util.Scanner;   
class AreaCurcul
{
   public static void main(String[] arg)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the radius:");
     int r=sc.nextInt();
     final int pi=(22/7);
     int area=pi*(r*r);
     System.out.println("the area of cicule is:"+area);
   }
}