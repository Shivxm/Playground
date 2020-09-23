#include<stdio.h>
int main()
{
  int i,n,a=0,j=2;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  printf("%d ",a);
    a=a+j;
    j=j+2;
  }
  return 0;
}