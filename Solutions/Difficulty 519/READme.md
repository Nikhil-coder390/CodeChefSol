# CodeChef Questions & Solutions

## 4. Exams
### Problem Statement
You are given
```3``` numbers
```A, B, and C```.

Determine whether the <strong>average</strong> of
```A``` and ```B``` is strictly greater than ```C``` or not?

<strong>NOTE:</strong> Average of
```A``` and ```B``` is defined as ```(A+B)/2```.

For example, average of ```5``` and ```9``` is ```7```, average of ```5```
and ```8``` is ```6.5```.

### Input Format
- The first line contains a single integer ```T```, denoting the number of cases.
- Each test case consists of 3 integers ```A, B, and C```.

### Output Format
For each test case, output ```YES``` if average of ```A``` and ```B``` is strictly greater than ```C```, ```NO``` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings ```YeS```, ```yEs```, ```yes``` and ```YES``` will all be treated as identical).

### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ A, B, C ≤ 10

### [Solution](./greaterAverage.java)


### Example
#### Input
```yaml
5
5 9 6
5 8 6
5 7 6
4 9 8
3 7 2
```
#### Output
```objectivec
YES
YES
NO
NO
YES
```
### Explanation
Test case 1: The average value of 5 and 9 is 7 which is strictly greater than 6.
Test case 2: The average value of 5 and 8 is 6.5 which is strictly greater than 6.
Test case 1: The average value of 5 and 7 is 6 which is not strictly greater than 6.
Test case 1: The average value of 4 and 9 is 6.5 which is not strictly greater than 8.
Test case 1: The average value of 3 and 7 is 5 which is strictly greater than 2.



You can copy and paste these into your repository. Let me know if you need any modifications! 🚀
