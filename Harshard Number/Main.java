#include<stdio.h>
int main()
{
int num,sum=0,temp,ans;
  scanf("%d",&num);
  temp=num;
  while(temp)
  {
  sum=sum+temp%10;
    temp=temp/10;
  }
  ans=num%sum;
  if(ans==0)
    printf("Harshard Number");
  else
    printf("Not Harshard Number");
  return 0;
}