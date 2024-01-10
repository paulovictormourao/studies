infinity = float('inf')


graph = {
    'start': {'a': 6, 'b': 2},
    'a': {'end': 1},
    'b': {'a': 3, 'end': 5},
    'end': {}
         }


costs = {'a': 6,
         'b': 2,
         'end': infinity}


fathers = {'a': 'start',
           'b': 'start',
           'end': None}


def find_cheaper(costs_relation, processed=None):
    if processed is None:
        processed = []

    min_n = infinity
    min_e = None
    for element in costs_relation.keys():

        if element not in processed:
            if costs_relation[element] < min_n:
                min_e = element
                min_n = costs_relation[element]

    return min_e


def dijkstra_alg(graph, costs, fathers):
    processed = []
    node = find_cheaper(costs)

    while node is not None:

        cost = costs[node]
        neighbors = graph[node]

        for n in neighbors.keys():

            new_cost = cost + neighbors[n]

            if new_cost < costs[n]:
                costs[n] = new_cost
                fathers[n] = node

                print(fathers)

        processed.append(node)
        node = find_cheaper(costs, processed)

    return str(fathers) + '\n' + str(costs)


print('\n' + dijkstra_alg(graph,costs,fathers))


