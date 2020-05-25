#include <stdio.h>
int main()
{
    int num,table,i;
    printf("Enter a number for print table: ");
    scanf("%d",&num);
    for (i = 1; i <= 10; i++)
    {
        table = num * i;
        printf("%d X %d = %d\n",num,i,table);
    }
}