// Простая иерархия классов
// Использование методов для установки и получения
// закрытых членов

// Класс, описывающий двумерные объекты
class TwoDShape {
    // закрытые члены суперкласса
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    // Конструктор с одинаковыми значениями width & height
    TwoDShape(double x) {
        width = height = x;
    }

    // Методы доступа к закрытым членам суперкласса
    double getWidth() {
        return width;
    }

    double getHeigth() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeigth(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Ширина и высота - " +
                width + " & " + height);
    }
}

// Подкласс для представления треугольников;
// Производный от класса TwoDShape
class Triangle extends TwoDShape {
    String style;

    // Конструктор по умолчанию
    Triangle() {
        super();
        style = "none";
    }

    // Конструктор
    Triangle(String s, double w, double h) {
//        setWidth(w);
//        setHeigth(h); // стр. 254
        super(w, h);

        style = s;
    }

    // Конструктор с одним аргументом
    Triangle(double x) {
        super(x);

        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeigth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Подкласс для представления прямоугольников;
// Производный от класса TwoDShape
//class Rectangle extends TwoDShape {
//    boolean isSquare() {
//        if (getWidth() == getHeigth()) return true;
//        return false;
//    }
//
//    double area() {
//        return getWidth() * getHeigth();
//    }
//}

class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(4.0);
        Triangle t3 = new Triangle("контурный", 8.0, 12.0);

//        t1.setWidth(4.0);
//        t1.setHeigth(4.0);
//        t1.style = "закрашенный";
//
//        t2.setWidth(8.0);
//        t2.setHeigth(12.0);
//        t2.style = "контурный";

        t1 = t3;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь: " + t3.area());

//        Rectangle r1 = new Rectangle();
//        r1.setWidth(4.0);
//        r1.setHeigth(4.0);
//
//        System.out.println();
//
//        System.out.println("Является ли r1 квадратом? Ответ: " + r1.isSquare());
//        System.out.println("Площадь: " + r1.area());
    }
}