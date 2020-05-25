

number = int(input("Enter number: "))
next = 1
prev = 0
if number == 1:
    print("0", end=" ")
else:
    print("0 1", end=" ")
for x in range(0,number - 2):
    print((next + prev), end=" ")
    temp = next + prev
    prev = next
    next = temp