#include<stdio.h>
int main()
{
 int i,j,k,m;
 scanf("%d%d%d",&i,&j,&k);
 if(i<j && i>k || i>j && i<k)
 printf("The treasure is in the box which has number %d.",i);
 else if(j<i && j>k || j>i && j<k)
 printf("The treasure is in the box which has number %d.",j);
 else
 printf("The treasure is in the box which has number %d.",k);
 for(m=2;m<9;m++)
 if(i%m==0 && j%m==0 && k%m==0)
 printf("\nThe code to open the box is %d.",m);
  return 0;
}