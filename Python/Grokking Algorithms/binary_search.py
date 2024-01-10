def binary_search(list, element):
    down = 0
    high = len(list) - 1

    while True:
        mid = int((high + down)/2)
        print(down, mid, high)

        if list[mid] == element:
            return mid

        elif element > list[mid]:
            down = mid + 1

        else:
            high = mid - 1


def bin_r(n, element, start, end):

    mid = int((end + start) / 2)
    print(start, mid, end)
    if n[mid] == element:
        return mid

    elif element > n[mid]:
        return bin_r(n, element, mid + 1, end)

    elif element < n[mid]:
        return bin_r(n, element, start, mid - 1)


                    # 0 1 2 3 4 5 6 7 8
print(binary_search([1,2,3,4,5,6,7,8,9], 9))
