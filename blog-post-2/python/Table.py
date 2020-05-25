num = int(input("Enter a number for print table: "))
table = 0
for x in range(1,11):
    table = num * x
    print(num," X ",x," = ",table)
