#include<stdio.h>
int main()
{
  int num,i,count=0;
  scanf("%d",&num);
  for(i=2;i<=num/2;i++)
  {
  if(num%i==0){
    count=1;
    break;}
  }
  if(num<=1)
    count=1;
  else if(num==2)
    count=0;
  else if(count==1)
    printf("Not prime");
  else
    printf("Prime");
  return 0;
}