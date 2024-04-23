//I made in Python
/*
class Recursion:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def is_empty(self):
        return len(self.items) == 0

    def peek(self):
        return self.items[-1]

    def reverse(self):
        if not self.is_empty():
            top = self.pop()
            self.reverse()
            self.insert_at_bottom(top)

    def insert_at_bottom(self, item):
        if self.is_empty():
            self.push(item)
        else:
            top = self.pop()
            self.insert_at_bottom(item)
            self.push(top)

input_str = input()

input_list = list(map(int, input_str.split()))

stack = Recursion()
list(map(stack.push, input_list))

stack.reverse()

print(stack.items)
 */