#include<stdio.h>
#include<math.h>
int main()
{
  int x,y,r;
  float inter,amount,disc,finall;
  scanf("%d %d %d",&x,&y,&r);
  inter=(x*y*r)/100;
  amount=x+inter;
  disc=inter*2/100;
  finall=x+inter-disc;
  printf("%.2f\n",inter);
         printf("%.2f\n",amount);
                printf("%.2f\n",disc);
                       printf("%.2f\n",finall);
                              return 0;
}