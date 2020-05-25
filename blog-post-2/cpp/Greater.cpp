#include <iostream>
using namespace std;

int main()
{

    int num1, num2, num3, gt;

    cout <<"Enter three number: ";
    cin >> num1;
    cin >> num2;
    cin >> num3;
    
    if (num1 > num2)
    {
        gt = num1;
    }
    else if (num2 > num3)
    {
        gt = num2;
    }
    else
    {
        gt = num3;
    }
    cout <<"Greater number: " << gt;
        
}