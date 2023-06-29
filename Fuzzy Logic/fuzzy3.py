import numpy as np
import skfuzzy as sk
import matplotlib.pyplot as plt

x_qual = np.arange(0, 11, 0.1)

kick = False
i = 1
while True:

    qual1 = sk.sigmf(x_qual, i, 2)

    plt.scatter(x_qual, qual1)

    if i == 10 or i == 0:
        kick = not kick

    if kick:
        i -= 1
    else:
        i += 1

    plt.grid()
    plt.draw()
    plt.show()
