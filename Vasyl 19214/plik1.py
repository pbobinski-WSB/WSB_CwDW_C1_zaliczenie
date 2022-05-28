n = int(input("n: "))
n= abs(n)

sum = 0

while n > 0:
    liczba = n % 10
    sum += liczba
    n //= 10

print("Suma liczb: ", sum)