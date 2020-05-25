#include <iostream>
using namespace std;
int main()
{
    int number, temp, count, result, reminder, pow = 1;
    cout <<"Enter number: ";
    cin >> number;
    temp = number;
    count = 0;
    result = 0;
    while (number > 0)
    {
        count++;
        number = number / 10;
    }

    number = temp;

    while (number > 0)
    {
        reminder = number % 10;
        while (count > 0)
        {
            pow *= reminder;
            count--;
        }
        result += reminder;
        number /= 10;
        pow = 1;
    }
    if (temp == result)
    {
        cout <<"Armgstrong number";
    }
    else
    {
        cout <<"Not armgstrong number";
    }
    return 0;
}