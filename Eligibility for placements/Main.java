#include<stdio.h>
int main()
{
  char a[20];
  float b;
  int c,d;
  scanf("%s%d%f%d",&a,&c,&b,&d);
  if(d==0 && b>=7.0 || d<=2 && b>=7.5)
    printf("%s\n%d\nEligible to attend placement",a,c);
  else
    printf("%s\n%d\nNot Eligible to attend placement",a,c);
  return 0;
}