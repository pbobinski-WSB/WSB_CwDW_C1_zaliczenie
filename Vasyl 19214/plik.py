from math import sqrt

a = int(input("Podaj wartosc a: "))
b = int(input("Podaj wartosc b: "))

def przeciwprostokatna(a, b):
    c = sqrt( pow(a, 2) + pow(b, 2) )
    return c
wynik = przeciwprostokatna(a,b)
print(wynik)
print("Good")