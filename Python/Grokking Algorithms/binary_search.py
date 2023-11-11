def ceil(n):
    if int(n) < n:
        return int(n + 1)
    return int(n)

def binary_search(list, element):
    down = 0
    high = len(list) - 1


    while True:
        mid = int((high + down)/2)
        print(high, mid, down)

        if list[mid] == element:
            return mid

        elif element > list[mid]:
            print('add min')
            down = mid + 1

        else:
            high = mid - 1
            print('add max')


                    #0 1 2 3 4 5 6 7 8
print(binary_search([1,2,3,4,5,6,7,8,9], 9))

