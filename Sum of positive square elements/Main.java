#include<stdio.h>
#include<math.h>
    int PerfectSquareEle(int num)
    {
        int i;
        float f;
        f=sqrt((double)num);
        i=f;
        if(i==f)
        return num;
        else
        return 0;
    }
        int main()
        {
            int n;
            scanf("%d",&n);
            int arr[n];
            int j;
            for(j = 0; j < n; j++)
            {
                scanf("%d",&arr[j]);
            }
            int sum = 0;
            for(j = 0; j < n; j++)
            {
               sum = sum + PerfectSquareEle(arr[j]);
            }
            printf("%d",sum);
            return 0;
        }