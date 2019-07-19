#include<stdio.h>
 int square(int num)
 {
    int sq;
   sq=num*num;
   return sq;
 
 }

int main() {
   // Type your code here
   int n,sq1;
    scanf("%d",&n);
   sq1= square(n);
    printf("%d",sq1);
   
}