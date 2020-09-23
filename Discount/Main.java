#include <stdio.h>
int main()
{
 int a,b;
 scanf("%d%d",&a,&b);
 switch(b)
 {
 case 1:
 printf("Chris father needs to pay Rs.%0.2f.",a-(a*0.2));
 break;
 case 3:
 case 4:
 printf("Chris father needs to pay Rs.%0.2f.",a-(a*0.1));
 break;
 case 6:
 case 7:
 printf("Chris father needs to pay Rs.%0.2f.",a-(a*0.75));
 break;
 case 10:
 case 11:
 printf("Chris father needs to pay Rs.%0.2f.",a-(a*0.3));
 break;
 case 12:
 printf("Chris father needs to pay Rs.%0.2f.",a-(a*0.35));
 break;
 case 2:
 case 5:
 case 8:
 case 9:
 printf("Chris father needs to pay Rs.800.00.");
 break;
}
  return 0;
}