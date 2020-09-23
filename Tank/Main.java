#include<stdio.h>
int main()
{
 float r,h,a,tn,area,x;
 scanf("%f%f%f%f",&r,&h,&a,&tn);
 area=3.14*r*r*h;
 x=a*tn;
 if(x>=area)
 printf("The tank can be filled within %0.1f hours",tn);
 else
 printf("The tank cannot be filled within %0.1f hours",tn);
  return 0;
}