#include<stdio.h>
int main()
{
  int x1,x2,x3,y1,y2,y3;
  float x,y;
  scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
  x=(x1+x2+x3)/3.0;
  y=(y1+y2+y3)/3.0;
  printf("%.1f\n%.1f",x,y);
  return 0;
}