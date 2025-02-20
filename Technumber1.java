class Technumber1
{
 public ststic void main(String[] arg)
 {
    int num=2025;
	int len=0;
	int div=1;
	for(int i=num;i>0;i/=10)
	 len++;
	 
	 if(len%2==0)
	 {
	  for(int i=1;i<=(len/2);i++)
	    div*=10;
		int fh=num/div;
		int sh=num%div;
		int sum=fh+sh;
		int sqrt=sum*sum;
		System.out.println(sqrt==num?num+"this is tech no":"this not tech no");
	 }
	 else
	 {
	 System.out.println(num+"the given no not tech no");
	 }
 
 }

}