#include <iostream>
using namespace std;

int main()
{
    int year, isLeapYear;
    cout <<"Enter year: ";
    cin >> year;
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
        cout <<"leap year";
    }
    else
    {
        cout <<"not leap year";
    }

    return 0;
}