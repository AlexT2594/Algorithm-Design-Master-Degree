from math import sqrt, fabs
from random import randint, uniform


class Point:
    def __init__(self, name, x=0, y=0):
        self.name = name
        self.x = x
        self.y = y

    def distance(self, point):
        w = fabs(self.x - point.x)
        h = fabs(self.y - point.y)
        return sqrt(w**2 + h**2)


def approximateDistance(points):
    length = len(points)
    if(length < 2):
        return 0
    xMin = points[0].x
    xMax = points[0].x
    yMin = points[0].y
    yMax = points[0].y

    for i in range(length):
        point = points[i]
        if(point.x < xMin):
            xMin = point.x
        if(point.x > xMax):
            xMax = point.x
        if(point.y < yMin):
            yMin = point.y
        if(point.y > yMax):
            yMax = point.y
    w = xMax - xMin
    h = yMax - yMin
    return max(w, h)

def distance(points):
    d = 0
    length = len(points)
    if(length < 2):
        return 0
    for i in range(length):
        localD = 0
        point = points[i]
        for j in range(length):
            if(i == j):
                continue
            localD = point.distance(points[j])
            if(localD > d):
                d = localD
    return d


def printPoints(points):
    length = len(points)
    for i in range(length):
        point = points[i]
        print(point.name + " (" + str(point.x) + ", " + str(point.y) + ")")


def main():
    A = Point("A", randint(-10, 10), randint(-10, 10))
    B = Point("B", randint(-10, 10), randint(-10, 10))
    C = Point("C", randint(-10, 10), randint(-10, 10))
    D = Point("D", randint(-10, 10), randint(-10, 10))
    E = Point("E", randint(-10, 10), randint(-10, 10))

    points = [A, B, C, D, E]
    dist = distance(points)
    approximateDist = approximateDistance(points)

    print("Points are:")
    printPoints(points)
    print("Distance is: " + str(dist))
    print("Distance approximation is " + str(approximateDist))
    print("Factor of approximation is: " + str(dist / approximateDist))


main()
