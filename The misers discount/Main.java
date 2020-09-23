#include<stdio.h>
int main()
{
  float i1,i2,disc,amount,price,saved_amount;
  scanf("%f%f%f",&i1,&i2,&disc);
  amount=i1+i2;
  saved_amount=(amount*disc)/100;
  price=amount-saved_amount;
  printf("%.2f\n%.2f\n%.2f",amount,price,saved_amount);
  return 0;
}