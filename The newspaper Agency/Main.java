#include<stdio.h>
int main()
{
  int w,x,y,profit,netprofit;
  scanf("%d%d%d",&w,&x,&y);
  profit=(w*x)-(w*y);
  netprofit=profit-100;
  //because The agency pays a fixed cost for storage and delivery so on of Rs.100 per Sunday.
  //The newspaper agency wants to calculate the profit which it obtains only on Sundays. 
  printf("%d",netprofit);
  return 0;
}