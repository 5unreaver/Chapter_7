// Обращение к объекту подкласса
// по ссылочной переменной суперкл.
class X {
    int a;

    X(int i) {
        a = i;
    }
}

class Y extends X {
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}

class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; // Допустимо, ибо обе переменные одного типа.
        System.out.println("x2.a: " + x2.a);

        x2 = y; // По-прежнему допустимо по указанной выше причине.
        System.out.println("x2.a: " + x2.a);

        // В классе X известны только члены класса X
        x2.a = 19; // допустимо
        // x2.b = 27; // ошибка, ибо перемен. b не является
        // членом класса X
    }
}
