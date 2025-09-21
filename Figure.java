package StringPrograms;

interface Figure {
    double calculateArea();
    double calculatePerimeter();
}

class Square implements Figure {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle implements Figure {
    double base, height, side1, side2, side3;
    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class TestFigures {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(4, 3, 4, 3, 5);

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}

