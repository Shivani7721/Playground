import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		Scanner s=new Scanner(System.in);
      	int sum=0,rem;
      	int num=s.nextInt();
      	while(num!=0)
        {
          	rem=num%10;
          	num=num/10;
			if(num==1||num==2||num==3||num==4||num==5||num==6||num==7||num==7||num==8||num==9)
            {
              	System.out.println(num);
              	break;
            }
        }
	}
}