#include<stdio.h> 
int main() 
{ 
  float height,weight,i,m,bmi; 
  scanf("%f%f",&weight,&height); 
  i=height/100; 
  m=i*i; 
  bmi=weight/m; 
  if(bmi<18.5) 
    printf("You are underweight. Have an apple daily."); 
  else if(bmi>18.5 && bmi<=24.9) 
    printf("You are normal. Go walking daily and maintain it."); 
  else if(bmi<=25 && bmi>=29.9) 
    printf("You are overweight. Go to the gym daily."); 
  else 
    printf("You are obese. Go to doctor"); 
  return 0;
}