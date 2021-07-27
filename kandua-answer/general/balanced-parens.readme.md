# Balanced Parentheses

### Background

When writing code, it's often nice to have an editor integration that will
auto-generate a closing bracket for each open bracket you type. For instance, if
you type `{`, your editor may actually print `{}` to the screen, with your
cursor set between the two braces.

This is useful, but sometimes we accidentally delete a parenthesis or bracket or
brace, and we want our editor to lint our code for such errors when they occur.

### Balancing Parentheses

Today we're going to create a function that, given any string containing any
arbitrary set of parentheses, brackets, or braces, can tell us if our
parentheses are balanced (that is, there is a proper closing parenthesis for
every opened parenthesis). The list of bracket pairs to balance is:
```
{},
(),
[]
```

```javascript
parensAreBalanced("([])") // true
parensAreBalanced("([)") // false
```

Careful though: not only do we need to make sure we have a balanced number of
parentheses, but that they are also in the correct order. If we have `({`, we
want to make sure we see a closing `}` before a closing `)`.


Once you have implemented your function test it with the following inputs: 

```
    Assert(ParensAreBalanced("()") );
    Assert(ParensAreBalanced("[]") );
    Assert(ParensAreBalanced("(") == false);
    Assert(ParensAreBalanced("]") == false);
    Assert(ParensAreBalanced("}") == false);

    Assert(ParensAreBalanced("((()))") );
    Assert(ParensAreBalanced("((())") == false);
    Assert(ParensAreBalanced("][[[[[[") == false);

    Assert(ParensAreBalanced("{([])}") );
    Assert(ParensAreBalanced("{([]}") == false);

    Assert(ParensAreBalanced("") );
    Assert(ParensAreBalanced("hello world") );

    Assert(ParensAreBalanced("function () { console.log([\"cat\", \"dog\"]) }") );
    Assert(ParensAreBalanced("function ( { console.log([\"cat\", \"dog\"]) }") == false);
    Assert(ParensAreBalanced("([)]") == false);
```

