#include<stdio.h>

int strlenx(char *Brr)
{
    int iCnt = 0;
    while(*Brr != '0')
    {
        iCnt++;
        Brr++;
    }
    return iCnt;
}

int main()
{   
    char Arr[] = {"Marvellous Infosystems"};
    int Ret = 0;

    Ret = strlenx(Arr);
    printf("length of string is : %d\n",strlenx(Ret));

    return 0;
}