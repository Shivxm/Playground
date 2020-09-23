#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  if(b%4==0)
    switch(a)
    {
      case 1:printf("Number of days is 31");
        break;
      case 2:printf("Number of days is 29");
        break;
      case 3:printf("Number of days is 31");
        break;
      case 4:printf("Number of days is 30");
        break;
      case 5:printf("Number of days is 31");
        break;
      case 6:printf("Number of days is 30");
        break;
      case 7:printf("Number of days is 31");
        break;
      case 8:printf("Number of days is 31");
        break;
      case 9:printf("Number of days is 30");
        break;
      case 10:printf("Number of days is 31");
        break;
      case 11:printf("Number of days is 30");
        break;
      case 12:printf("Number of days is 31");
        break;
      default:printf("Enter valide number");
    }
  else
    switch(a)
    {
      case 1:printf("Number of days is 31");
        break;
      case 2:printf("Number of days is 28");
        break;
      case 3:printf("Number of days is 31");
        break;
      case 4:printf("Number of days is 30");
        break;
      case 5:printf("Number of days is 31");
        break;
      case 6:printf("Number of days is 30");
        break;
      case 7:printf("Number of days is 31");
        break;
      case 8:printf("Number of days is 31");
        break;
      case 9:printf("Number of days is 30");
        break;
      case 10:printf("Number of days is 31");
        break;
      case 11:printf("Number of days is 30");
        break;
      case 12:printf("Number of days is 31");
        break;
      default:printf("Enter valide number");
    }
  return 0;
}