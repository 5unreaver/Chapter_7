public class TwoDShapePage269 {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShapePage269() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShapePage269(double w, double h) {
        width = w;
        height = h;
    }

    // Создать объект с одинаковыми значениями
    // переменных экземпляра width & height
    TwoDShapePage269(double x) {
        width = height = x;
    }

    // Создать один объект на основе другого
    TwoDShapePage269(TwoDShapePage269 ob) {
        width = ob.width;
        height = ob.height;
    }

    // Методы доступа к переменным экземпляра width, height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Ширина и высота = "
                + width + " и " + height);
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShapePage269
class TrianglePage270 extends TwoDShapePage269 {
    private String style;

    // Конструктор по умолчанию
    TrianglePage270() {
        super();
        style = "none";
    }

    TrianglePage270(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса
        style = s;
    }

    TrianglePage270(double x) {
        super(x);
        style = "закрашенный";
    }

    TrianglePage270(TrianglePage270 ob) {
        super(ob); // передача объекту конструктору класса TwoDShapePage269
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes7 {
    public static void main(String args[]) {
        TrianglePage270 t1 = new TrianglePage270("контурный", 8.0, 12.0);
        TrianglePage270 t2 =
                new TrianglePage270
                        (t1);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь: " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь: " + t2.area());

    }
}
