import math


def maxSum(array):
    currentMax = optimumMax = array[0]
    for i in range(1, len(array)):
        currentMax = max(array[i], currentMax + array[i])
        optimumMax = max(currentMax, optimumMax)
    return optimumMax


def maxProd(array):
    for i in range(len(array)):
        array[i] = math.log10(array[i])
    optimumMax = maxSum(array)
    return math.pow(10, optimumMax)


array = [5, 0.5, 0.1, 2, 0.75, 4, 0.8]
print("Array is: " + str(array))
result = maxProd(array)
print("Answer is: " + str(result))
