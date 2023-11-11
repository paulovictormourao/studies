class Row:
    def __init__(self, array):
        self.items = array

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if len(self.items) == 0:
            return

        item = self.items[0]
        self.items.remove(item)
        return item


row = Row([1])
print(row.items)

row.push(4)
print(row.items)

print(row.pop())
print(row.items)
