# We want to be able to modify any given function, creating a clone of it which, when called, repeats the given function several times.
# On creation of the new clone function, we need to be able to specify how many times the given function should be repeated.
# As such, your task is to define a function `create_repeating_clone`, that works exactly as described above.


# say_hello_to_full_name is a demo function, which we'll use as test input for `create_repeating_clone`
def say_hello_to_full_name(name, secondName):
    print('Hello, %s %s!' % (name, secondName))
    return ('Hello, %s %s!' % (name, secondName))


def say_hello_to_first_name(name):
    print('Hello, %s!' % (name))
    return ('Hello, %s!' % (name))


def create_repeating_clone(inputFunction, timesToRepeat):
    def repeating_function(arg1, arg2):
        return None
    return repeating_function


assert create_repeating_clone(say_hello_to_full_name, 3)('Sello', 'Mkantjwa') == ['Successful'] * 3
assert create_repeating_clone(say_hello_to_first_name, 4)('Sello') == ['Successful'] * 4
