import pandas as pd
import numpy as np
import keras
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import MinMaxScaler
from keras.layers import Dense, Dropout
from keras.models import Sequential
from keras.optimizers import Adam

dataset = pd.read_csv('kc_house_data.csv')

X = dataset.iloc[:, 3:].values
X = X[:, np.r_[0:13,14:18]]
y = dataset.iloc[:, 2].values

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.2, random_state = 0)

xscaler = MinMaxScaler(feature_range = (0,1))
X_train = xscaler.fit_transform(X_train)
X_test = xscaler.transform(X_test)

yscaler = MinMaxScaler(feature_range = (0,1))
y_train = yscaler.fit_transform(y_train.reshape(-1,1))
y_test = yscaler.transform(y_test.reshape(-1,1))

model = Sequential()
model.add(Dense(units = 64, kernel_initializer = 'uniform',
activation = 'relu', input_dim = 17))

model.add(Dense(units = 16, kernel_initializer = 'uniform',
activation = 'relu'))
model.add(Dense(units = 1, kernel_initializer = 'uniform',
activation = 'relu'))
model.compile(optimizer = Adam(lr = 0.001), loss = 'mse',
metrics = ['mean_absolute_error'])
