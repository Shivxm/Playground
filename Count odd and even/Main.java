#include<stdio.h>
int main()
{
  int i,a[100],n,c=0,count=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
   for(i=0;i<n;i++)
  {
     if(a[i]%2==0)
     {
        count=count+1;
     }
     else
     { 
       c=c+1;
     }
   
    
  }
  printf("Odd: %d",c);
  printf("\nEven: %d",count);
  return 0;
}