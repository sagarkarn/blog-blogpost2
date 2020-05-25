mMark = int(input("Enter Math mark: "))
sMark = int(input("Enter Science mark: "))
eMark = int(input("Enter English mark: "))

validate = False

if (mMark >= 0 and mMark <= 100
    and (mMark >= 0 and mMark <= 100)
    and (mMark >= 0 and mMark <= 100)) :
        validate = True

if (validate):
    average = (mMark + sMark + eMark) / 3
    if (average < 30):
        print("Fail")
    elif (average < 40):
        print("Grade: C")
    elif (average < 60):
        print("Grade: B")
    else:
        print("Grade: A")


else:
    print("Wrong input")
