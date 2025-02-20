class ISBNnumber 
{
  public static void main(String[] arg)
  {
    long num= 1234567890l;
	int sum=0;
	for(long i=num,j=1;i>0;i/=10,j++)
	{
		long rem=i%10;
	    sum+=(rem*j);
	}
	if(sum%11==0)
	{
		System.out.println(num+"this is an ISBN no");
		
	}
	else
	{
		System.out.println(num+"this is not isbn no");
	}
		
  }

}