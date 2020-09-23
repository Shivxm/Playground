#include<stdio.h>
int main()
{
  int a,b,c,d,x,y,overs;
  float finishovers,currentrunrate,totalrunrate;
  scanf("%d%d%d%d",&a,&b,&c,&d);
  overs=a/6;
  x=d/6;
  y=d%6;
  finishovers=(float)x+(float)y/10;
  currentrunrate=c/finishovers;
  totalrunrate=(b*6.0)/a;
  if(currentrunrate>totalrunrate)
    printf("%d\n%.1f\n%.1f\n%.1f\nEligible to Win",overs,finishovers,currentrunrate,totalrunrate);
  else
    printf("%d\n%.1f\n%.1f\n%.1f\nNot Eligible to Win",overs,finishovers,currentrunrate,totalrunrate);
  return 0;
}