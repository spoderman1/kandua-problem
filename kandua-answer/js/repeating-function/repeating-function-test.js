const test = require('tape')
const repeatingFunction = require('./repeating-function');

function sayHelloTo(name) {
    console.log(`Hello ${[...arguments]}!`);
    return "Successful";
}

test('returns the correct result when the input function has no parameters', assert => {
    assert.same(repeatingFunction(sayHelloTo, 2)(), ["Successful", "Successful"]);
    assert.end()
});

test('returns the correct result when the input function has 1 parameter', assert => {
    assert.same(repeatingFunction(sayHelloTo, 2)("Arjun"), ["Successful", "Successful"]);
    assert.end()
});

test('returns the correct result when the input function has more than 1 parameter', assert => {
    assert.same(repeatingFunction(sayHelloTo, 2)("Arjun", "Sello", "Kandua"), ["Successful", "Successful"]);
    assert.end()
});

test('returns the correct result when the input function is timesToRepeat is 1', assert => {
    assert.same(repeatingFunction(sayHelloTo, 1)("Arjun", "Sello", "Kandua"), ["Successful"]);
    assert.end()
});

test('returns the correct result when the input function is more than 1', assert => {
    assert.same(repeatingFunction(sayHelloTo, 10)("Arjun", "Sello", "Kandua"), Array(10).fill("Successful"));
    assert.end()
});

test('returns the correct result when the input function is 0', assert => {
    assert.same(repeatingFunction(sayHelloTo, 0)("Arjun", "Sello", "Kandua"), []);
    assert.end()
});
