
# Write a function that computes future investment value at a given interest rate for a specified number of years.

# I get the principal, rate, years, and compounding frequency from the user and then I plug it into the compound interest formula.
# I use the for loop to have it calculate the amounts for the next 30 years.



def futureInvestmentValue(principal, rate, years, frequency):
    
    value = principal * (1 + rate/frequency)**(years*frequency)
    return  round(value, 2)
    
    
# Write a test program that prompts the user to enter the investment amount (e.g.,
# 1000) and the interest rate (e.g., 9%) and prints a table that displays future value
# for the years from 1 to 30.

print('What is your initial investment amount?')
initialAmount = float(input())


print('\nWhat is the interest rate? (enter as a decimal)')
interestRate = float(input())

print('\nHow many times per year is the interest compounded?')
frequency = float(input())

print('\nWhat is your goal amount?')
goalAmount = float(input())
print()

# Added a way to calculate how long it would take to reach a certain financial goal at that rate.
for i in range(100):
    yearlyValue = futureInvestmentValue(initialAmount, interestRate, i, frequency)
    
    if yearlyValue > goalAmount:
        print('You will reach your goal in', i, 'years! \n')
        
        break

for i in range(31):
    print('Year', str(i) + ':', '$' + str(futureInvestmentValue(initialAmount, interestRate, i, frequency)))
    
