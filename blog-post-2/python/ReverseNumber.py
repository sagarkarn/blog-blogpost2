num = int(input("Enter number: "))

reverse = 0
while num > 0:
    rm = int(num % 10)
    reverse = (reverse * 10) + rm
    num = int(num / 10)

print("reverse number: ", reverse)
