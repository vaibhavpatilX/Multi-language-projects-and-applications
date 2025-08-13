#include<stdio.h>

int Addition(int Num1,int Num2)
{
    int Add = 0;
    Add= Num1 + Num2;
    return Add;
}
int main()
{
    int No1 = 10,No2 = 11,Ans = 0;

    Ans = Addition(No1,No2);
    
    printf("Addition is : %d\n",Ans);
    return 0;
}