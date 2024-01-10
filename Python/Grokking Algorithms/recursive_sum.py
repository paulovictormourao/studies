def sum_r(n):
    if len(n) == 1:
        return n[0]

    elif len(n) == 0:
        return void

    else:
        item = n[0]
        n.pop(0)
        return item + sum_r(n)
