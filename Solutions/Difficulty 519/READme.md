# CodeChef Questions & Solutions

## 4. Exams
### Problem Statement
In Chefland, there are ```X``` schools, and each school has ```Y``` students. The year end results are in and a total of ```Z``` students passed the exams.

Assuming that all students appeared for the exams, find whether the number of students who passed in Chefland was <strong>strictly greater than</strong>
```50%```.

### Input Format
- The first line contains a single integer ```T```, denoting the number of cases.
- Each test case consists of three space-separated integers ```X```, ```Y```, and ```Z```, as mentioned in the statement.

### Output Format
For each test case, output on a new line, ```YES```, if the total number of students who passed in Chefland was strictly greater than ```50%```, otherwise print ```NO```.

You may print each character of the string in uppercase or lowercase (for example, the strings ```YeS```, ```yEs```, ```yes``` and ```YES``` will all be treated as identical).

### Constraints
- 1 ≤ T ≤ 2.10^4
- 1 ≤ X ≤ 5
- 1 ≤ Y ≤ 50
- 1 ≤ Z ≤ X.Y

### [Solution](./greaterAverage.java)


### Example
#### Input
```yaml
4
2 10 12
2 10 3
1 5 3
3 6 9
```
#### Output
```objectivec
YES
NO
YES
NO
```
### Explanation
Test case 1: The total number of students appeared were 2 ⋅ 10 = 20. The number of students passed were 12. Thus, number of students who passed are 60 % 60%, which is strictly greater than 50%.

Test case 2: The total number of students appeared were 2⋅10=20. The number of students passed were 3. Thus, number of students who passed are 15%, which is less than 50%.

Test case 3: The total number of students appeared were 1⋅5=5. The number of students passed were 3. Thus, number of students who passed are 60%, which is strictly greater than 50%.

Test case 4: The total number of students appeared were 3⋅6=18. The number of students passed were 9. Thus, number of students who passed are 50%, which is equal to 50%.

You can copy and paste these into your repository. Let me know if you need any modifications! 🚀
