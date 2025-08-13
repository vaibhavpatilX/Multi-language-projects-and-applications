#include<stdio.h>
#include<stdlib.h>

int main()
{
    double *p = NULL;
    int size = 0;

    printf("enter no. of elements that u want ton allocate : \n");
    scanf("%d",&size);

    p = (double *)malloc(size * sizeof(double));
    if(p == NULL)
    {
        printf("Unable to allocate the memory\n");
        return -1;
    }
    printf("Memory gets allocated successfully for %d \n",size);

    //Use of memory

    free(p);
    return 0;
}