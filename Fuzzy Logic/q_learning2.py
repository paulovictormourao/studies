import numpy as np

actions = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

gamma = 0.75
alpha = 0.9

# Dictionary
location_to_state = {'A': 0,
                    'B': 1,
                    'C': 2,
                    'D': 3,
                    'E': 4,
                    'F': 5,
                    'G': 6,
                    'H': 7,
                    'I': 8,
                    'J': 9,
                    'K': 10,
                    'L': 11}

r = np.array([
[0,1,0,0,0,0,0,0,0,0,0,0],
[1,0,1,0,0,1,0,0,0,0,0,0],
[0,1,0,0,0,0,1,0,0,0,0,0],
[0,0,0,0,0,0,0,1,0,0,0,0],
[0,0,0,0,0,0,0,0,1,0,0,0],
[0,1,0,0,0,0,0,0,0,1,0,0],
[0,0,1,0,0,0,1000,1,0,0,0,0],
[0,0,0,1,0,0,1,0,0,0,0,1],
[0,0,0,0,1,0,0,0,0,1,0,0],
[0,0,0,0,0,1,0,0,1,0,1,0],
[0,0,0,0,0,0,0,0,0,1,0,1],
[0,0,0,0,0,0,0,1,0,0,1,0]])


q = np.zeros([12, 12])

# Implementing the Q-Learning process
for i in range(1000):
    current_state = np.random.randint(0, 12)
    playable_actions = []

    for j in range(12):
        if r[current_state, j] > 0:
            playable_actions.append(j)

    next_state = np.random.choice(playable_actions)
    td = r[current_state, next_state] + gamma * q[next_state,
    np.argmax(q[next_state,])] - q[current_state, next_state]
    q[current_state, next_state] = q[current_state, next_state] + alpha * td

state_to_location = {state: location for location, state in location_to_state.items()}


def route(starting_location, ending_location):
    route = [starting_location]
    next_location = starting_location

    while (next_location != ending_location):
        starting_state = location_to_state[starting_location]
        next_state = np.argmax(q[starting_state,])
        next_location = state_to_location[next_state]
        route.append(next_location)
        starting_location = next_location

    return route

def route(starting_location, ending_location):
    r_new = np.copy(r)
    ending_state = location_to_state[ending_location]
    r_new[ending_state, ending_state] = 1000
    q = np.array(np.zeros([12,12]))
    for i in range(1000):
        current_state = np.random.randint(0,12)
        playable_actions = []
        for j in range(12):
            if r_new[current_state, j] > 0:
                playable_actions.append(j)
        next_state = np.random.choice(playable_actions)
        td = r_new[current_state, next_state] + gamma * q[next_state,
        np.argmax(q[next_state,])] - q[current_state, next_state]
        q[current_state, next_state] = q[current_state, next_state] + alpha * td
    route = [starting_location]
    next_location = starting_location
    while (next_location != ending_location):
        starting_state = location_to_state[starting_location]
        next_state = np.argmax(q[starting_state,])
        next_location = state_to_location[next_state]
        route.append(next_location)
        starting_location = next_location
    return route

# PART 3 - GOING INTO PRODUCTION
# Making the final function that returns the optimal route
def best_route(starting_location, intermediary_location, ending_location):
    return route(starting_location, intermediary_location) + route(intermediary_location, ending_location)[1:]

r = np.array([[0,1,0,0,0,0,0,0,0,0,0,0],
              [1,0,1,0,0,1,0,0,0,0,0,0],
              [0,1,0,0,0,0,1,0,0,0,0,0],
              [0,0,0,0,0,0,0,1,0,0,0,0],
              [0,0,0,0,0,0,0,0,1,0,0,0],
              [0,1,0,0,0,0,0,0,0,1,0,0],
              [0,0,1,0,0,0,0,1,0,0,0,0],
              [0,0,0,1,0,0,1,0,0,0,0,1],
              [0,0,0,0,1,0,0,0,0,1,0,0],
              [0,0,0,0,0,1,0,0,1,0,1,0],
              [0,0,0,0,0,0,0,0,0,1,0,1],
              [0,0,0,0,0,0,0,1,0,0,1,0]])

print('Route: ')

for i in best_route('A','C','L'):
    print(i)
