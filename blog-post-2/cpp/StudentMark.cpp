#include <iostream>
using namespace std;

int main()
{
    int mMark,sMark,eMark,validate;
    cout << "Enter Math mark: ";
    cin >> mMark;
    cout << "Enter Science mark: ";
    cin >> sMark;
    cout << "Enter English mark: ";
    cin >> eMark;

    validate = 0;

    if ((mMark >= 0 && mMark <= 100) && (mMark >= 0 && mMark <= 100) && (mMark >= 0 && mMark <= 100))
    {

        validate = 1;
    }

    if (validate)
    {
        int average = (mMark + sMark + eMark) / 3;
        if (average < 30)
        {
            cout << "Fail";
        }
        else if (average < 40)
        {
            cout << "Grade: C";
        }
        else if (average < 60)
        {
            cout << "Grade: B";
        }
        else
        {
            cout << "Grade: A";
        }
    }
    else
    {
        cout << "Wrong input";
    }
}