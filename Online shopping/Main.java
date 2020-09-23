#include<stdio.h>
int main()
{
  int shirt1,discount1,charges1,shirt2,discount2,charges2,shirt3,discount3,charges3;
  int f,s,a,d1,d2,d3;
  scanf("%d%d%d%d%d%d%d%d%d",&shirt1,&discount1,&charges1,&shirt2,&discount2,&charges2,&shirt3,&discount3,&charges3);
 d1=(shirt1*discount1)/100;
  d2=(shirt2*discount2)/100;
  d3=(shirt3*discount3)/100;
  f=shirt1-d1+charges1;
  s=shirt2-d2+charges2;
  a=shirt3-d3+charges3;
  printf("In Flipkart: Rs.%d\n",f);
  printf("In Snapdeal: Rs.%d\n",s);
  printf("In Amazon: Rs.%d\n",a);
  if(f<s && f<a)
    printf("He will prefer Flipkart");
  else if(s<a)
    printf("He will prefer Snapdeal");
  else
    printf("He will prefer Amazon");
  return 0;
}