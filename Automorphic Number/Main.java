#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  b=a*a;
  if(b%10==a)
    printf("Automorphic Number");
  else
    printf("Not Automorphic Number");
  return 0;
}