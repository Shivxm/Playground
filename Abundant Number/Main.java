#include<stdio.h>
int main()
{
  int num,sum=0,i;
  scanf("%d",&num);
  for(i=1;i<num;i++)
  {
  if(num%i==0)
    sum=sum+i;
  }
  if(num<sum)
    printf("Abundant Number");
  else
    printf("Not Abundant Number");
  return 0;
}