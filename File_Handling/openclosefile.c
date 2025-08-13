#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];

    printf("Enter the file name you want to open: \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);

    if(fd == -1)
    {
        printf("Unable yo open file\n");
        return -1;
    }
    else
    {
        printf("File is opened successfully with fd : %d\n",fd);
    }
    close(fd);
    return 0;
}