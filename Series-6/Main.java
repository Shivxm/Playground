#include<stdio.h>
int main()
{
  int i,n,a=1,b;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    b=pow(a,a);
    printf("%d ",b);
    a++;
  }
  return 0;
}