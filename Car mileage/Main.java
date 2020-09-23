#include<stdio.h>
int main()
{
  int a,b;
  float c;
  scanf("%f%d%d",&c,&a,&b);
  if(c*a>=b)
    printf("Can reach");
  else
    printf("Cannot reach");
  return 0;
}