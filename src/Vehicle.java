class TruckDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle musclecar = new Vehicle(2, 14, 12);

        // Рассчитать дальность поездки при полном баке.
        System.out.println("Фургон может провезти " + minivan.getPassengers()
                + " человек на " + minivan.range() + " миль ценою "
                + minivan.fuelneeded(minivan.range()) + " галлонов топлива.");
        System.out.println("Маслкар может провезти " + musclecar.getPassengers()
                + " человек на " + musclecar.range() + " миль ценою "
                + musclecar.fuelneeded(musclecar.range()) + " галлонов топлива.\n");

        // Создать ряд новых объектов типа Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargo()
                + " фунтов.");
        System.out.println("Для преодоления " + dist
                + " миль грузовику требуется "
                + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargo()
                + " фунтов.");
        System.out.println("Для преодоления " + dist
                + " миль пикапу требуется "
                + gallons + " галлонов топлива.\n");
    }
}

class Vehicle {
    private int passengers, fuelcap, mpg;

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    // Определить объём топлива, необходимого
    // ТС для преодоления заданного расстояния.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменной экземпляра
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap; // грузоподъёмность в фунтах

    // Конструктор класса Truck
    Truck(int p, int f, int m, int c) {
        /* Инициализация членов класса Vehicle
        с использованием конструктора этого класса. */
        super(p, f, m);
        cargocap = c;
    }

    // Методы доступа к переменно cargocap
    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }
}

class OffRoad extends Vehicle {
    private  int groundClearance; // дорожный просвет в дюймах

    OffRoad(int p, int f, int m, int g) {
        /* Инициализация членов класса Vehicle
        с использованием конструктора этого класса. */
        super(p, f, m);
        groundClearance = g;
    }
}