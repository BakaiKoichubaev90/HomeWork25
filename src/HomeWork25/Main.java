package HomeWork25;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(12345,"01kg597AII");
        Car car2 = new Car(12346,"01kg998AII");
        Car car3 = new Car(12347,"01kg134AII");
        Car car4 = new Car(12348,"03kg719ADA");
        Car car5 = new Car(12349,"01kg196AII");
        Info info1 = new Info(1998,"mersedes",500000,"kara");
        Info info2 = new Info(2005,"toyota",750000,"kara");
        Info info3 = new Info(2002,"audi",500000,"kara");
        Info info4 = new Info(2000,"toyota",1200000,"kara");
        Info info5 = new Info(1992,"bmw",150000,"kara");
        HashMap<Car,Info> hashMap = new HashMap<>();
        hashMap.put(car1, info1);
        hashMap.put(car2, info2);
        hashMap.put(car3, info3);
        hashMap.put(car4, info4);
        hashMap.put(car5, info5);
        for (HashMap.Entry entry:hashMap.entrySet()) {
            System.out.println(entry);
            System.out.println("-----------------------------------------");

        }
    }
}
