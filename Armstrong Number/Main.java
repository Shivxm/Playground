#include<stdio.h>
#include<math.h>
int main()
{
int num,temp,r,ans=0,n=0;
  scanf("%d",&num);
  temp=num;
  while(temp!=0)
  {
  temp=temp/10;
    ++n;
  }
  temp=num;
  while(temp!=0)
  {
  r=temp%10;
    ans=ans+pow(r,n);
    temp=temp/10;
  }
  if(ans==num)
    printf("Armstrong Number");
  else
    printf("Not Armstrong Number");
  return 0;
}