#include<stdio.h>
int main()
{
  int i,n,f=1,s=2,next;
  printf("Enter n value\n");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ",f);
  next=f+s;
    f=s;
    s=next;
  }
  return 0;
}