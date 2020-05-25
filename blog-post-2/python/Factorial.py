number = int(input("Enter number: "))
factorial = 1
x = 0
for x in range(0,number):
    factorial *=  x+1

print(number, "\b! = " , factorial)

#((4))