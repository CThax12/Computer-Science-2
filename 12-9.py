import csv


# Type your code here. 
fileName = input()
with open(fileName, 'r') as csvfile:
    wordsFile = csv.reader(csvfile, delimiter = ",")
    wordsList = []
    for row in wordsFile:
        wordsList = row
    
    wordsDict = {}
    
    for word in wordsList:
        if word not in wordsDict:
            wordsDict[word] = 1
        else:
            wordsDict[word] +=1

    for word in wordsDict:
        print(word, wordsDict[word])
    
