
print('Enter 10 numbers separated by a space.')
input1 = input()



input1 = input1.split(' ')


sum = 0
for i in range(len(input1)):
    input1[i] = int(input1[i])
    sum += input1[i]

count = len(input1)
print(sum)
print(count)
print('The average of these numbers is:', sum/count)