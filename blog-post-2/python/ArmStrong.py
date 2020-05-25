from math import pow

number = int(input("Enter number: "))
temp = number
count = 0
result = 0
while number > 0:
    count += 1
    number = int(number/10)

number = temp
reminder = 0
while(number > 0):
    reminder = (number % 10)
    result += int(pow(reminder, count))
    number = int(number / 10)

if(temp == result):
    print("Armgstrong number")
else:
    print("Not armgstrong number")
