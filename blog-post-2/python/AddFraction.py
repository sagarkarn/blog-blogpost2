

n1 = int(input("Enter Enter first numerator and denumenator"))
d1 = int(input())
n2 = int(input("Enter second numerator and denumenator"))
d2 = int(input())

n3 = (n1 * d2) + (n2 * d1)
d3 = d1 * d2
gcd = 0
x = 0
if(n3 < d3):
    min = n3
else:
    min = d3

for x in range(2, min+1):
    if n3 % x == 0 and d3 % x == 0:
        gcd = x

if(gcd > 0):
    print(f"Sum: {int(n3/gcd)}/{int(d3/gcd)}")
else:
    print(f"Sum: {int(n3)}/{int(d3)}")
