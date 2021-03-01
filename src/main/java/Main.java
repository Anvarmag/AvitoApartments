public class Main {
    public static void main(String[] args) {
        AvitoApartments apartment1 = new AvitoApartments();
        apartment1.id = 1;
        apartment1.name = "ЖК 'Станция Спортивная'";
        apartment1.street = "пр-д Детский,д.1 к2,р-н Приволжский";
        apartment1.room = 1;
        apartment1.square = 31.2;
        apartment1.floor = 9;
        apartment1.price = 4_046_000;
        System.out.println(apartment1.image);
        System.out.println(apartment1.room);
        System.out.println(apartment1.square);
        System.out.println(apartment1.floor);
        System.out.println(apartment1.price);
        System.out.println(apartment1.name);
        System.out.println(apartment1.street);
        System.out.println(apartment1.url);

        AvitoApartments apartment2 = new AvitoApartments();
        apartment2.id = 2;
        apartment2.name = "ЖК 'Казань 21 век'";
        apartment2.street = "пр-т Альберта Камалеева,д.32Б";
        apartment2.room = 1;
        apartment2.square = 33;
        apartment2.floor = 17;
        apartment2.price = 4_350_000;
        apartment2.distance = 2.5;
        System.out.println(apartment2.image);
        System.out.println(apartment2.room);
        System.out.println(apartment2.square);
        System.out.println(apartment2.floor);
        System.out.println(apartment2.price);
        System.out.println(apartment2.name);
        System.out.println(apartment2.street);
        System.out.println(apartment2.distance);
        System.out.println(apartment2.url);

        AvitoApartments apartment3 = new AvitoApartments();
        apartment3.id = 3;
        apartment3.street = "ул.Карла Маркса,д.39А";
        apartment3.room = 3;
        apartment3.square = 132.1;
        apartment3.floor = 4;
        apartment3.price = 21_150_000;
        apartment3.distance = 1.1;
        System.out.println(apartment3.image);
        System.out.println(apartment3.room);
        System.out.println(apartment3.square);
        System.out.println(apartment3.floor);
        System.out.println(apartment3.price);
        System.out.println(apartment3.street);
        System.out.println(apartment3.distance);
        System.out.println(apartment3.url);
    }
}
