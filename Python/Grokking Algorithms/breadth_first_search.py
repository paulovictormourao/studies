from collections import deque


def is_sealer(name):
    if name == 'jonny':
        print(name + ' is sealer')


def breadth_first_search(graph):

    search_row = deque()
    search_row += graph['start']

    verified = []

    while search_row:
        print(search_row)
        person = search_row.popleft()

        if person not in verified:
            if is_sealer(person):
                return True

            else:
                search_row += graph[person]
                verified.append(person)

    return False


graph_ex = {
        "start": ["alice", "bob", "claire"],
        "bob": ["anuj", "peggy"],
        "alice": ["peggy"],
        "claire": ["thom", "jonny"],
        "anuj": [], "peggy": [], "thom": [], "jonny": []
        }

breadth_first_search(graph_ex)
