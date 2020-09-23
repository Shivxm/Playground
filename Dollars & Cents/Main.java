#include<stdio.h>
int main()
{
  int doll1,doll2,cent1,cent2,total_doll,total_cent;
  scanf("%d%d%d%d",&doll1,&cent1,&doll2,&cent2);
  total_doll=doll1+doll2;
  total_cent=cent1+cent2;
  while(total_cent>100)
  {
  total_cent=total_cent-100;
    total_doll=total_doll+1;
  }
  printf("%d\n%d",total_doll,total_cent);
  return 0;
}