#include<stdio.h>
int main()
{
  int a,sum1,sum2;
  float avg1,avg2,i=0.00,j=0.00;
  do{
    scanf("%d",&a);
    if(a!=-1)
    {
    if(a%2==0)
    {
      ++i;
    sum1=sum1+a;
      avg1=sum1/i;
    }
      else
      {
        ++j;
      sum2=sum2+a;
        avg2=sum2/j;
      }
    }
  }while(a>-1);
  printf("%d\n%d\n%.2f\n%.2f",sum1,sum2,avg1,avg2);
  return 0;
}