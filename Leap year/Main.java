#include<stdio.h>
int main()
{
  //Type your code here
  int y,r;
  scanf("%d",&y);
  r=y%4;
  if(r==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}