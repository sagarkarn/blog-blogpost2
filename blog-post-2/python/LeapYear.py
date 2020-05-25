isLeapYear = False
year = int(input("Enter year: "))

if(year % 4 == 0):
    isLeapYear = True
    if year % 100 == 0 and year % 400 != 0:
        isLeapYear = False

if(isLeapYear):
    print("leap year")
else:
    print("not leap year")
