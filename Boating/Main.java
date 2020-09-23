
#include<stdio.h>
int main()
{
  int weight,adults,child,a;
  scanf("%d%d%d",&weight,&adults,&child);
  a=(adults*75)+(child*30);
  if(a<=weight)
    printf("Boat is stable");
  else
    printf("Boat will drow");
  return 0;
}