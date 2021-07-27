def parens_are_balanced(input_data):
    return True


assert parens_are_balanced('()') is True
assert parens_are_balanced('[]') is True
assert parens_are_balanced('(') is False
assert parens_are_balanced(']') is False
assert parens_are_balanced('}') is False

assert parens_are_balanced('((()))') is True
assert parens_are_balanced('((())') is False
assert parens_are_balanced('][[[[[[') is False

assert parens_are_balanced('{([])}') is True
assert parens_are_balanced('{([]}') is False

assert parens_are_balanced('') is True
assert parens_are_balanced('hello world') is True

assert parens_are_balanced('function () { console.log(["cat", "dog"]) }') is True
assert parens_are_balanced('function ( { console.log(["cat", "dog"]) }') is False
assert parens_are_balanced('([)]') is False

print('ALL TESTS PASSED')