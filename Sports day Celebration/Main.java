#include<stdio.h>
int main()
{
  int stud,teams,stud_team,rem;
  scanf("%d",&stud);
  scanf("%d",&teams);
  stud_team=stud/teams;
  rem=stud%teams;
  printf("%d\n",stud_team);
  printf("%d\n",rem);
  return 0;
}