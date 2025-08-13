#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];
    int Ret = 0;
    char Buffer[] = "Hello World";

    printf("Enter the file name : \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }
    
    Ret = write(fd,Buffer,8); ///fd not written in book prototype
    printf("%d bytes gets written successfully\n",Ret);
    
    close(fd);
    return 0;
}