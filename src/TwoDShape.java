// Простая иерархия классов

/// Класс, описывающий двумерные объекты
class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Ширина и высота - " +
                width + " & " + height);
    }
}

// Подкласс для представления треугольников;
// Производный от класса TwoDShape
class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Подкласс для представления прямоугольников;
// Производный от класса TwoDShape
class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }
}

class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "закрашенный";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: " + t2.area());

        Rectangle r1 = new Rectangle();
        r1.width = 4.0;
        r1.height = 4.0;

        System.out.println();

        System.out.println("Является ли r1 квадратом? Ответ: " + r1.isSquare());
        System.out.println("Площадь: " + r1.area());
    }
}