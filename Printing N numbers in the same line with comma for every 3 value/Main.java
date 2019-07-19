#include <stdio.h>
int main() {
	//Type your codef
   int n,m=3,start_count;
   scanf("%d%d",&n,&m);
   for(start_count=1;start_count<=n;start_count++)
   {
     printf("%d",start_count);
     if((start_count % m == 0) && (start_count != n))
     {
       printf(",");
     }
   }
	return 0;
}