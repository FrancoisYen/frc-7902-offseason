/*
 * FRC 7902 Markham FireBirds Programming Division Off-Season Training
 * Unit 1, Lesson 4
 * François Yen
 * 28.07.25
 */

package U1.L4;

public class Polygon {
    /* Solve for remaining angle given two angles in triangle */

    // Radians (double)
    protected double remainingAngle(double rad1, double rad2) throws IllegalArgumentException {
        if (rad1 <= 0 || rad2 <= 0 || rad1 + rad2 >= Math.PI) {
            throw new IllegalArgumentException("Invalid angles.");
        }
        return Math.PI - (rad1 + rad2);
    }

    // Degrees (int)
    protected int remainingAngle(int deg1, int deg2) throws IllegalArgumentException {
        if (deg1 <= 0 || deg2 <= 0 || deg1 + deg2 >= 180) {
            throw new IllegalArgumentException("Invalid angles.");
        }
        return 180 - (deg1 + deg2);
    }

    /* Volume of cube */
    
    protected double volume(double side, boolean isCube) throws IllegalArgumentException {
        if (!isCube) {
            throw new IllegalArgumentException("Cannot calculate volume of square.");
        }
        return side * side * side;
    }

    /* Overloaded methods for calculating area */

    // Square & cube
    protected double area(double side, boolean isCube) {
        if (isCube) {
            return side * side * 6;
        } else {
            return side * side;
        }
    }

    // Rectangle
    protected double area(double length, double width) {
        return length * width;
    }

    // Triangle (Heron's formula)
    protected double area(double a, double b, double c) {
        return Math.sqrt(perimeter(a, b, c) / 2 * (perimeter(a, b, c) / 2 - a) * (perimeter(a, b, c) / 2 - b)
                * (perimeter(a, b, c) / 2 - c));
    }

    /* Overloaded methods for calculating perimeter */

    // Rectangle
    protected double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Triangle
    protected double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
    }
}

class Rectangle extends Polygon {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class Trapezium extends Rectangle {
    double height;

    public Trapezium(double base1, double base2, double height) {
        super(base1, base2);
        this.height = height;
    }
}

class Triangle extends Polygon {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class obtuseTriangle extends Triangle {
    public obtuseTriangle(double a, double b, double c) {
        super(a, b, c);
    }
}

class acuteTriangle extends Triangle {
    public acuteTriangle(double a, double b, double c) {
        super(a, b, c);
    }
}

class rightTriangle extends Triangle {
    public rightTriangle(double a, double b, double c) {
        super(a, b, c);
    }
}