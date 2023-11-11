import re


def have_exception(problem):
    inputs = problem.split(' ')

    # Middle input (operator)
    if not((inputs[1] == '+') or (inputs[1] == '-')):
        return 'Error: Operator must be \'+\' or \'-\'.'

    # Test the numbers
    for i in range(len(inputs)):
        if i != 1:
            number = inputs[i]

            if not re.match(r"^[0-9]+$", number):
                return 'Error: Numbers must only contain digits.'

            elif len(number) > 4:
                return 'Error: Numbers cannot be more than four digits.'

    return False


def problem_space(problem):
    problem = problem
    inputs = problem.split(' ')
    len_first_number = len(inputs[0])
    len_second_number = len(inputs[2])

    return len_first_number + 2 if len_first_number > len_second_number else len_second_number + 2


def line_format(term, space, have_operator=False):
    if not have_operator:
        str_format = ' '*(space - len(term)) + term + ' '*4
    else:
        str_format = ' '*(space - len(term) - 1) + term + ' '*4

    return str_format


def formatter(problems, show_result=False):
    str_first_line = ''
    str_second_line = ''
    line = ''
    result_line = ''

    for problem in problems:
        # Creat lines
        first_number = problem.split(' ')[0]
        op = problem.split(' ')[1]
        second_number = problem.split(' ')[2]

        space = problem_space(problem)

        str_first_line += line_format(first_number, space)
        str_second_line += op + line_format(second_number, space, True)
        line += '-'*space + ' '*4

        if show_result:
            if op == '+':
                result = str(int(first_number) + int(second_number))
            else:
                result = str(int(first_number) - int(second_number))

            result_line += line_format(result, space)

    total = str_first_line.rstrip() + '\n' + str_second_line.rstrip() + '\n' + line.rstrip()
    if show_result:
        total += '\n' + result_line.rstrip()

    return total


def arithmetic_formatter(problems, show_result=False):
    problems_len = len(problems)
    # Exceptions:
    if problems_len > 5:
        return 'Error: Too many problems.'

    elif problems_len == 1:
        problem = problems
        if have_exception(problem):
            print(have_exception(problem))

    else:
        for problem in problems:
            if have_exception(problem):
                return have_exception(problem)


    return formatter(problems, show_result)


print(arithmetic_formatter(['3 / 855', '3801 - 2', '45 + 43', '123 + 49']))
