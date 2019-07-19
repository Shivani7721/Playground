#include <stdio.h>
int main() {
	//Type your code
    int n,sd=0;
    scanf("%d",&n);
    while(n>=100)
    {
      n =n/10;
    }
    sd=n%10;
    printf("%d",sd);
     
	return 0;
}