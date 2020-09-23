#include<stdio.h>
int main()
{
  int n,days;
  scanf("%d",&n);
  days=n/(1-(1/sqrt(n)));
  printf("%d",days);
  return 0;
}