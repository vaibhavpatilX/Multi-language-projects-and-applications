#include<stdio.h>

int main()
{
    int No1 = 0;
    int No2 = 0;

    printf("Enter first number : ");
    scanf("%d",&No1);

    
    printf("Enter first number : ");
    scanf("%d",&No2);

    if(No1>No2)
    {
        printf("%d is Maximum number\n",No1);
    }
    else
    {
        printf("%d is Maximum number\n",No2);
    }

    return 0;
}