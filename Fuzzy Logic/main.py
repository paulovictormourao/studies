import numpy as np
import skfuzzy as sk
import matplotlib.pyplot as plt

x_values = np.arange(0, 11, 0.01)

graphic = sk.trapmf(x_values, [1, 2, 8, 10])

plt.scatter(x_values, graphic)


graphic2 = sk.trimf(x_values, [1, 5, 10])

plt.scatter(x_values, graphic2)

plt.grid()
plt.show()
