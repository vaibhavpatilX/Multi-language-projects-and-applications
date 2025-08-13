#include<stdio.h>

int Addition(int Num1,int Num2)
{
    int Add = 0;
    Add = Num1 + Num2;
    return Add;
}
int main()
{

    int No1 =0 ,No2=0,Ans=0;

    printf("Enter first no: ");
    scanf("%d",&No1);
    
    printf("Enter Second no: ");
    scanf("%d",&No2);
    Ans = Addition(No1,No2);

    printf("Addition is : %d",Ans);
    return 0;
}