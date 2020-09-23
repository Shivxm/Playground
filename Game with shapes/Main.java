#include<stdio.h>
int main()
{
  int a,b,d;
  scanf("%d%d",&a,&b);
  d=2*a;
  if(d<=b)
    printf("circle can be inside a square");
  else
    printf("circle cannot be inside a Square");
  return 0;
}