#include<stdio.h>
int main()
{
  int sal,emi,fees,food,parents,sum=0;
  scanf("%d%d%d%d%d",&sal,&emi,&fees,&food,&parents);
  sum=emi+fees+food+parents;
  if(sum<sal)
    printf("He can save the money");
  else if(sum==sal)
    printf("He can manage the expenses");
  else
  printf("He has to work hard");
  return 0;
}