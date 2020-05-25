#include <iostream>
using namespace std;

int main()
{
    int num,table,i;
    cout << "Enter a number for print table: ";
    cin >> num;
    for (i = 1; i <= 10; i++)
    {
        table = num * i;
        cout << num <<" X "<< i << " = " << table << endl;
    }
}