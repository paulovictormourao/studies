import copy
import random
# Consider using the modules imported above.

class Hat:
    def __init__(self, **kwargs):
        self.dict = kwargs
        self.contents = []

        for element in kwargs:
            for i in range(kwargs[element]):
                self.contents.append(element)

    def draw(self, number_of_remove):
        if number_of_remove > len(self.contents):
            return self.contents

        removed_elements = []

        for i in range(number_of_remove):
            element = random.choice(self.contents)
            removed_elements.append(element)
            self.contents.remove(element)

        return removed_elements


def list_to_dict(input_list):
    result_dict = {}

    for element in input_list:
        if element in result_dict:
            result_dict[element] += 1
        else:
            result_dict[element] = 1

    return result_dict


def experiment(hat, expected_balls, num_balls_drawn, num_experiments):

    M = 0

    for exp in range(num_experiments):

        hat_exp = copy.deepcopy(hat)
        expected_balls_exp = copy.deepcopy(expected_balls)

        list_drawn = hat_exp.draw(num_balls_drawn)
        for ball in list_drawn:
            if ball in expected_balls_exp:
                expected_balls_exp[ball] -= 1
            print(expected_balls_exp)

        errors = 0
        for color in expected_balls_exp:
            if expected_balls_exp[color] > 0:
                errors += 1

        if errors == 0:
            M += 1

    return M/num_experiments


hat = Hat(blue=3, red=2, green=6)
probability = experiment(hat,{"blue": 2, "green": 1}, num_balls_drawn=4, num_experiments=1000)
print(probability)

#hat = prob_calculator.Hat(yellow=5, red=1, green=3, blue=9, test=1)
#probability = prob_calculator.experiment(hat, {"yellow": 2, "blue": 3, "test": 1}, 20, 100)