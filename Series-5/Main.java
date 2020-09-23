#include<stdio.h>
int main()
{
  int i,n,f=2,s=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  printf("%d ",f);
    f=(f*2)-s;
    s++;
  }
  return 0;
}