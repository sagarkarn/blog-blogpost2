#include <stdio.h>

int main(int argc, char const *argv[])
{
    int number,factorial = 1,i;
    printf("Enter number: ");
    scanf("%d",&number);
    for (int i = 1; i <= number; i++)
    {
        factorial *= i;
    }
    printf("%d ! = %d",number,factorial);
    return 0;
}
