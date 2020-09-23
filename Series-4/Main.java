#include<stdio.h>
int main()
{
  int i,n,j=3,f=0;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  printf("%d ",f);
    f=f+j;
    j=j+2;
  }
  return 0;
}