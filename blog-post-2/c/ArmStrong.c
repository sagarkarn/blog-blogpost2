#include &lt;stdio.h&gt;
int main()
{
    int number, temp, count, result, reminder, pow = 1;
    printf("Enter number: ");
    scanf("%d", &number);
    temp = number;
    count = 0;
    result = 0;
    while (number &gt; 0)
    {
        count++;
        number = number / 10;
    }

    number = temp;

    while (number &gt; 0)
    {
        reminder = number % 10;
        while (count &gt; 0)
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
        printf("Armgstrong number");
    }
    else
    {
        printf("Not armgstrong number");
    }
    return 0;
}