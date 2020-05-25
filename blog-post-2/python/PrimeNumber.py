number = int(input("Enter number "))
primeNumber = True
if number != 2:
    for x in range(2,int(number / 2)) :
        if number % x == 0 :
            primeNumber = False
            break
        
    

if (primeNumber) :
    print(number,"is prime number")
else :
    print(number,"is not prime number")

