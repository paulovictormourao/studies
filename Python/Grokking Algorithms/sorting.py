# Insertion Sort

def insertion(array):
    count = 0
    size = len(array)

    for i in range(1, size):
        j = i
        while j > 0 and array[j] < array[j - 1]:
            array[j - 1], array[j] = array[j], array[j - 1]
            j -= 1
            count += 1
            print(array)

    print(f'ITER: {count}')
    return array


###########################################################################################

# Selection sort

def find_min(array):
    count = 0
    minor_i = 0
    minor = array[0]
    for i in range(1, len(array)):
        if array[i] < minor:
            minor = array[i]
            minor_i = i
        count += 1
    return minor_i, count


def selection(array):
    count = 0
    size = len(array)
    new_array = []
    for i in range(size):
        index = find_min(array)[0]
        count += find_min(array)[1]
        new_array.append(array.pop(index))
        print(new_array)
        count += 1
    print(f'ITER: {count}')

    return new_array

######################################################################

# Bubble Sort


def bubble(array):
    size = len(array)
    count = 0
    for i in range(size):
        for j in range(size - i - 1):
            if array[j] > array[j+1]:
                count += 1
                array[j], array[j+1] = array[j+1], array[j]
                print(array)
    print(f'ITE: {count}')
    return array


def interface():
    choice = 1
    while choice != 0:
        choice = int(input('[0] EXIT\n'
                           '[1] INSERTION\n'
                           '[2] SELECTION\n'
                           '[3] BUBBLE\n'))

        test_array = [19, 7, 1, 2, 5, 8, 0]

        if choice == 1:
            print(insertion(test_array))

        elif choice == 2:
            print(selection(test_array))

        elif choice == 3:
            print(bubble(test_array))

        else:
            continue


interface()
