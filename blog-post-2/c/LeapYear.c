#include <stdio.h>

int main()
{
    int year, isLeapYear;
    printf("Enter year: ");
    scanf("%d", &year);
    isLeapYear = 0;
    if (year % 4 == 0)
    {
        isLeapYear = 1;
        if (year % 100 == 0 && year % 400 != 0)
        {
            isLeapYear = 0;
        }
    }
    if (isLeapYear == 1)
    {
        printf("leap year");
    }
    else
    {
        printf("not leap year");
    }

    return 0;
}