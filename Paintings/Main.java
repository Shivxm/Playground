#include<stdio.h>
int main()
{
  int l1,b1,l2,b2,l3,b3;
  scanf("%d%d%d%d%d%d",&l1,&b1,&l2,&b2,&l3,&b3);
  if((l2+l3)<=l1 && (b2+b3)<=b1)
    printf("Raj can fix both painting");
  else
    printf("Raj cannot fix both painting");
  return 0;
}