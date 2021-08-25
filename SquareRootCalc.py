#Build a function to provide the square root of a number. 

def squareRoot(num):
    if num == 0:
        return 0
    
    nextGuess = num/2
    lastNumber = num + 1
    
    while nextGuess != lastNumber:
        newNumber = num/nextGuess
        lastNumber = nextGuess
        nextGuess = (nextGuess+newNumber)/2
        
    return nextGuess

    

#Write another code to demonstrate your function works.

print('The square root of 100 is:', squareRoot(100))
print('The approximate square root of 50 is:', squareRoot(50))
print('Input a number to get the square root.')
userNumber = float(input())

print('The square root of', userNumber, 'is:', squareRoot(userNumber))