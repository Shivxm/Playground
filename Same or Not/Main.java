#include<stdio.h>
int main()
{
  int i,a[100],b[100],n,v,c=0;
  scanf("%d",&n);
  scanf("%d",&v);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
 for(i=0;i<v;i++)
  {
    scanf("%d",&b[i]);
  }
  for(i=0;i<n;i++)
  {
    if(a[i]==b[i])
    {
      c=c+1;
    }
  }
  if(c==v)
  {printf("Same");}
  else
  {printf("Not Same");}
}