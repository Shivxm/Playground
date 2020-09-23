#include<stdio.h>
int main()
{
  int coin,ben,black,q,r,bs;
  scanf("%d%d%d",&coin,&ben,&black);
  q=((coin*ben)/100);
  r=coin-q;
  bs=((r*black)/100);
  printf("%d\n%d\n%d",q,bs,(r-bs)/3);
  return 0;      
}