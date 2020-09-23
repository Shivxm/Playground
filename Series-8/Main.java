#include<stdio.h>
int main()
{
int num=101,i,count,n,j=0;
scanf("%d",&n);
while(j<n)
{
  count = 0;
  i=2;
    while(i<=num/2)
     {
       if(num%i==0)
	{
          count++;
          break;
        }
       i++;
     }   
    if(count==0)
     {
       printf("%d ",num);
       j++;	
     }
    num++;
}
 return 0;
}