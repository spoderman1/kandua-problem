# Target Sum Exists

### Determining if a Target Sum Exists

Build an algorithm that takes an arbitrarily sized list of numbers, and a target value,
and returns true if it's possible that two numbers in the list sum up
to the requested target, and false otherwise.

####Examples
```c#
TargetSumExistsInTwoNumbers([10, 20], 30) // true
TargetSumExistsInTwoNumbers([10, 20, 6, 8], 35) // false
```
Keep in mind that a number from the list may be used twice. e,g:

```c#
TargetSumExistsInTwoNumbers([10, 20], 40) // true
```

Once done, test your output on the following:
```
Assert((TargetSumExistsInTwoNumbers(new[] {10, 20}, 30)));
Assert(TargetSumExistsInTwoNumbers(new[] {10, 20}, 35) == false);
Assert((TargetSumExistsInTwoNumbers(new[] {10, 20}, 40)));
Assert((TargetSumExistsInTwoNumbers(new[] {-9, 10}, 1)));
Assert(TargetSumExistsInTwoNumbers(new[] {10, -8}, 1) == false);
Assert((TargetSumExistsInTwoNumbers(new[] {10, 2, 4, -9, 6}, 1)));
Assert(TargetSumExistsInTwoNumbers(new[] {2, 4, -9, 6}, 1) == false);
```


### Bonus!

Once you have `TargetSumExistsInTwoNumbers` passing the first few tests, see if
you can make use of it to complete `TargetSumExistsInThreeNumbers`. Test this function on:

```
Assert((TargetSumExistsInThreeNumbers(new []{2, 4, 10, 5, -9}, 3)));
Assert(TargetSumExistsInThreeNumbers(new []{2, 4, 10, 5, -9}, 170) == false);
```
