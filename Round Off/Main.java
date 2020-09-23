#include<stdio.h>
int main()
{
  int b;
  float a;
  scanf("%f",&a);
  b=(int)a;
  printf("%d\n",b);
  printf("%.1f\n",ceil(a));
  printf("%.1f\n",floor(a));
}