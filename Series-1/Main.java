#include<stdio.h>
int main()
{
  int n,a=6,b=4,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  if(i%2==0)
  {
  a=a+1;
    printf("%d ",a);
  }
    else
    {
    b=b+1;
      printf("%d ",b);
    }
  }
  return 0;
}