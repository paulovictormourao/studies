import math

array = [13, -3, -25, 20, -3 , -6, - 23, 18, 20, -7, 12, -5, -22, 15, -4 , 7]
       # 0    1   2   3    4    5    6    7   8   9  10  11   12   13  14   15
       #[13, -3, -25, 20, -3 , -6, - 23, 18], 0 ,3
       #[13, -3, -25], 0, 1
       #[13], 0, 0

def find_max1(A, start, finish):
    max_left = 0
    max_right = 0
    mid = math.floor(finish/2)
    sum_left = 0
    sum = 0

    for i in range (mid, -1, -1):
       sum += A[i]
       if sum > sum_left:
           sum_left = sum
           max_left = i


    sum_right = 0
    sum = 0

    for i in range (mid + 1, finish + 1):
       sum += A[i]
       if sum > sum_right:
           sum_right = sum
           max_right = i


    return max_left, max_right, sum_left + sum_right

def find_max_subarray(A, s, f):
    if s == f:
        return s, f, A[s]

    else:
        mid = math.floor( ((s+f)/2))

        left_start, left_finish, left_total = find_max_subarray(A, s, mid)
        right_start, right_finish, right_total = find_max_subarray(A, mid+1, f)
        cross_start, cross_finish, cross_total = find_max1(A, s, f)

        if left_total >= right_total >= cross_total:
            return left_start, left_finish, left_total

        elif left_total >= right_total >= cross_total:
            return right_start, right_finish, right_total

        else:
            return cross_start, cross_finish, cross_total

s, f, t = find_max_subarray(array, 0, len(array) - 1 )

for i in range (s, f+1):
    print(array[i], end='  ')


