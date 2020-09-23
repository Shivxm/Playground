#include <stdio.h>
int main(){
    int num,r,sum=0,t;
    scanf("%d",&num);

    for(t=num;num!=0;num=num/10){
         r=num % 10;
         sum=sum*10+r;
    }
    if(t==sum)
         printf("Same");
    else
         printf("Not Same");
  return 0;
}