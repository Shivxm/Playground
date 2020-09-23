#include<stdio.h>
int main()
{
 char ch[15];
 int i,j,k,a,b,c;
 scanf("%s%d%d%d",&ch,&i,&j,&k);
 if(i==0)
 printf("Out of stock");
 else if(i>=k)
 {

 b=k-i;
 printf("\n%d %s currently available in the stock",b);
 a=j*k;
 printf("The amount of %d %s is %d",k,ch,a);
 }
 else
 {
 c=k-i;
 printf("Only %d %s are available",c);
 }
return 0;
}