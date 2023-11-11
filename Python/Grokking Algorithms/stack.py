class Stack:
    def __init__(self, array):
        self.items = array

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if len(self.items) == 0:
            return

        return self.items.pop()


stack = Stack([1, 2, 3])
print(stack.items)

stack.push(4)
print(stack.items)

print(stack.pop())
print(stack.items)
