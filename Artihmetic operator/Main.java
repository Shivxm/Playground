#include<stdio.h>
void main()
{
  int a,b,add,sub,mul,mod;
  float div;
  scanf("%d %d",&a,&b);
  add=a+b;
  sub=a-b;
  mul=a*b;
  mod=a%b;
  div=a/(float)b;
  printf("%d\n",add);
  printf("%d\n",sub);
  printf("%d\n",mul);
  printf("%d\n",mod);
  printf("%.0f\n",div);
  //fill your code
}