#include<stdio.h>

int main()
{
    char ch = 'M';
    int no = 11;
    float marks = 89.90f;
    double data = 98.8986657;

    printf("Value of ch is : %c\n",ch);
    printf("Value of no is : %d\n",no);
    printf("Value of marks is : %f\n",marks);
    printf("Value of data is : %f\n",data);

    printf("Size of character is : %d byte\n",sizeof(ch));
    printf("Size of integer is : %d bytes\n",sizeof(no));
    printf("Size of float is : %d bytes\n",sizeof(marks));
    printf("Size of double is : %d bytes\n",sizeof(data));

    return 0;
}