#include<stdio.h>
 int sum_no(int num)
  {
    int i,num1;
     num1=num*(num+1)/2;
    
   return num1;
  }
int main() {
    // Type your code here
   int n,n1;
  scanf("%d",&n);
  n1=sum_no(n);
  printf("%d",n1);
  	return 0;
}