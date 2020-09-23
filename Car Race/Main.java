#include<stdio.h>
int main()
{
  int A,B,C,n;
  scanf("%d%d%d%d",&A,&B,&C,&n);
  if(A%n==0)
    printf("Car 1 goes into road A");
  else if(B%n==0)
   printf("Car 1 goes into road B");
  else if(C%n==0)
    printf("Car 1 goes into road C");
  else 
    printf("No path exist");
  return 0;
}