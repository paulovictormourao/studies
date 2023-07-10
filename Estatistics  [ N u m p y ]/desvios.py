import numpy as np
import matplotlib.pyplot as plt


def get_average(array, array_size):
    av = 0
    for i in array:
        av += i

    return av / array_size


def mean_deviation(array, array_size):
    average = get_average(array, array_size)
    s = 0

    for i in array:
        i = abs(i - average)
        s += i

    plt.scatter(array, np.arange(0, 7, 1))

    return s / array_size


x = np.arange(17, 24, 1)

print(mean_deviation(x, x.size))
