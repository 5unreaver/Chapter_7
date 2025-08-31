// Демонстрация очерёдности вызова конструкторов

// Суперкласс
class OrderOfCallingConst {
    OrderOfCallingConst() {
        System.out.println("Конструктор OrderOfCallingConst");
    }
}

// Создать подкласс путём расширения суперкласса A
class C extends OrderOfCallingConst {
    C() {
        System.out.println("Конструктор B");
    }
}

// Создать подкласс путём расширения класса C
class D extends C {
    D() {
        System.out.println("Конструктор D");
    }
}

class OrderOfConstr {
    public static void main(String[] args) {
        D d = new D();
    }
}