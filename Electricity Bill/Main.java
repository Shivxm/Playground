#include<stdio.h>
int main()
{
  //fill your code
  int a,b,c,d,e;
  scanf("%d",&a);
  b=ceil(a*0.5);
  c=ceil(a*0.65+100);
  d=ceil(a*0.80+200);
  e=ceil(a*1.25+425);
  if(a<=200)
    printf("Rs.%d",b);
  else if(a>200 && a<=400)
     printf("Rs.%d",c);
  else if(a>400 && a<=600)
     printf("Rs.%d",d);
  else
    printf("Rs.%d",e);
  return 0;
}