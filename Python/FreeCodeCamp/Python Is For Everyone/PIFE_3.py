class Category:
    def __init__(self, category):
        self.category = category
        self.cash = 0.0
        self.spend = 0.0
        self.ledger = []

    def get_balance(self):
        return self.cash

    def check_funds(self, value_test):
        return self.cash >= value_test

    def deposit(self, amount, description=''):
        self.ledger.append({"amount": amount, "description": description})
        self.cash += amount

    def withdraw(self, waste, description=''):
        if self.check_funds(waste):
            self.ledger.append({"amount": -1 * waste, "description": description})
            self.cash -= waste
            self.spend += waste

        return self.check_funds(waste)

    def transfer(self, transfer_amount, cat_transfer):
        if self.check_funds(transfer_amount):
            self.withdraw(transfer_amount, 'Transfer to ' + cat_transfer.category)
            cat_transfer.deposit(transfer_amount, 'Transfer from ' + self.category)

        return self.check_funds(transfer_amount)

    def __str__(self):
        size = len(self.category)
        stars = '*' * int((30 - size) / 2)

        f_str = stars + self.category + stars + '\n'

        for element in self.ledger:
            value = f'{element["amount"]:.2f}'
            disc = element["description"]
            disc = disc[0: 29 - len(value)]

            f_str += disc
            f_str += ' ' * (30 - len(disc + value))
            f_str += value + '\n'
        f_str += f'Total: {self.cash}'

        return f_str


def create_spend_chart(category_list):
    spend_list = []
    relative_spend = {}
    f_str = 'Percentage spent by category\n'

    for element in category_list:
        spend_list.append(element.spend)

    total_spend = sum(spend_list)

    for j in range(len(spend_list)):
        relative_spend[category_list[j].category] = spend_list[j] / total_spend * 100

    for i in range(100, -1, -10):
        f_str += f'{i:3d}| '
        for value in relative_spend.values():
            if value >= i:
                f_str += 'o  '
            else:
                f_str += '   '
        f_str += '\n'

    f_str += '    ' + '-' * (3 * len(category_list) + 1) + '\n'

    max_len = max(len(category.category) for category in category_list)

    for i in range(max_len):
        f_str += '     '
        for category in category_list:
            if i < len(category.category):
                f_str += f'{category.category[i]}  '
            else:
                f_str += '   '
        if i < max_len - 1:
            f_str += '\n'

    return f_str
