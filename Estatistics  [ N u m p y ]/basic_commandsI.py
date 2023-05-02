"""Basic Commands I
Author: Paulo Victor Mourão
Last Modified on: 02/05/2023
-----------------------------
Firsts commands in numpy
and plot a graphic with matplot
"""

import numpy as np
import matplotlib.pyplot as plt


def analysis(array):
    print(array)
    print('dim: ', array.ndim)
    print('shape: ', array.shape)
    print('-' * 32)


# Define a list with 5 points of a straight line  that pass for (1,2) and (5,10)
y0 = np.linspace(2, 10, 5, True, False, int)
analysis(y0)
plt.scatter(x = y0/2, y = y0)
plt.show()

y1 = y0[np.newaxis, :]  # add a dimension to the vector y, transform him in a line matrix 1x5
analysis(y1)

y2 = y0[:, np.newaxis]  # add a dimension to the vector y, transform him in a column matrix 5x1
analysis(y2)
