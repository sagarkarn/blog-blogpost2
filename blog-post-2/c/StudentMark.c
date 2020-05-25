#include <stdio.h>

int main()
{
    int mMark,sMark,eMark,validate;
    printf("Enter Math mark: ");
    scanf("%d",&mMark);
    printf("Enter Science mark: ");
    scanf("%d",&sMark);
    printf("Enter English mark: ");
    scanf("%d",&eMark);

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
            printf("Fail");
        }
        else if (average < 40)
        {
            printf("Grade: C");
        }
        else if (average < 60)
        {
            printf("Grade: B");
        }
        else
        {
            printf("Grade: A");
        }
    }
    else
    {
        printf("Wrong input");
    }
}