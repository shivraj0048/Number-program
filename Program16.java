import java.util.Scanner;   
class Program1
{
   public static void main(String[] arg)
   {
      int num=1234;
      int evensum=0;
      int oddsum=0;
      int rem=0;
      int len=1;
      for(int i=num;i>=1;i/=10)
      {  
          len++;
      	 rem=i%10;
      	 if(rem%2==0)
      	 {
      	 	evensum=evensum+rem;
      	 	System.out.println(rem+"the even sum:"+evensum);
      	 }
      	 if(rem%2!=0)
      	 {
      	 	oddsum=oddsum+rem;
      	 	System.out.println(rem+"the odd sum:"+oddsum);
      	 }
      	 
  

      }
   }
}