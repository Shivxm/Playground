#include<stdio.h>
int main()
{
  int i,n,a=10,b=5;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  if(i%2==0)
  {
  printf("%d ",a);
    a=a+50;
  }
    else
    {
    printf("%d ",b);
      b=b+10;
    }
  }
  return 0;
}