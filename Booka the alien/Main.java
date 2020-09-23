#include<stdio.h>
int main()
{
  int days,years,weeks;
  scanf("%d",&days);
  years=days/365;
  weeks=(days%365)/7;
  days=(days%365)%7;
  printf("%d\n%d\n%d",years,weeks,days);
  return 0;
}