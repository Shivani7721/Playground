import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		Scanner s=new Scanner(System.in);
      	int count=0,sum=0,rem;
      	int num=s.nextInt();
      	while(num!=0)
        {
          	rem=num%10;
          	num=num/10;
			count++;
          	if(count==2)
            {
              	System.out.println(rem);
            }
        }
	}
}