class Shape {
    public double GetArea() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }

    public double GetArea() {
        return 0.5 * base * height;
    }
}


class Square extends Shape {
    double side;
    public Square(double side) {
        this.side = side;
    }

    public double GetArea() {
        return side * side;
    }
} 

class Area {
    public static void main(String[] args) {
        Shape[] s = new Shape[2];
        s[0] = new Square(2);
        s[1] = new Triangle(6, 8);
        System.out.println(s[0].GetArea());
        System.out.println(s[1].GetArea());
    }
}