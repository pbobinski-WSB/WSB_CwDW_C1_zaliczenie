import random, os

def gra():
    os.system('clear')
    print("Wylosowałem dla ciebie liczbę z przedziału od 0 do 10 postaraj się ją znaleźć. Twoja liczba prób to 10")
    life, number, score, answer = 10, random.randint(0, 9), 0, 0

    while life > 0:
        answer = int(input())
        if answer == number:
            score+=1
            print("Brawo!!! \n Wylosowałem dla ciebie kolejną liczbę.")
            number = random.randint(0, 9)
        elif answer < number:
            life-=1
            print("Troszkę więcej ;)")
        elif answer > number:
            life-=1
            print("Troszkę mniej ;)")

    os.system('clear')
    print("Twój wynik to: "+ str(score)+"Chcesz zagrać jeszcze raz? (y / n)")
    x = input()
    if x == "y":
        gra()

gra()
