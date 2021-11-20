import random
import matplotlib.pyplot as plt
from matplotlib.colors import ListedColormap

def FlipTheCoin():
    coinFlipResults = []
    for i in range(25):
        flip = random.randint(0,1)
        coinFlipResults.append(flip)
    return coinFlipResults

def PlotCoinFlips(coinFlipResults):
    classes = ['Heads', 'Tails']
    colours = ListedColormap(['r','b'])

    values = []
    for i in range(25):
        values.append(i)

    scatter = plt.scatter(values, coinFlipResults, c=coinFlipResults, cmap=colours)
    plt.legend(handles=scatter.legend_elements()[0], labels=classes)

    plt.title("25 Coin Flips")
    plt.show()



coinFlipResults = FlipTheCoin()
PlotCoinFlips(coinFlipResults)