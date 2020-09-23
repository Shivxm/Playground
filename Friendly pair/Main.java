#include<stdio.h>
int main()
{
  int a,b,sum1=0,sum2=0,i,m,n;
  scanf("%d%d",&a,&b);
  for(i=1;i<a;i++)
  {
  if(a%i==0)
    sum1=sum1+i;
  }
  for(i=1;i<b;i++)
  {
  if(b%i==0)
  sum2=sum2+i;
  }
  m=sum1/a;
  n=sum2/b;
  if(m==n)
    printf("Friendly Pair ");
  else
    printf("Not Friendly Pair");
  return 0;
}