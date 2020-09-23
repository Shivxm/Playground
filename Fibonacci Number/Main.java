#include<stdio.h>
int main()
{
  int n,i,f=0,s=1;
  scanf("%d",&n);
  while(0!=1)
  {
  i=f+s;
    if(n==i){
      printf("Fibonacci Number");
      break;}
    if(n<i)
    {
    printf("Not Fibonacci Number");
      break;
    }
    f=s;
    s=i;
  }
  return 0;
}