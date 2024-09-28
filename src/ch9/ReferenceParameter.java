package ch9;

public class ReferenceParameter {

    public static void main(String[] args) {
        Car car = new Car();
        car.year = "2024";
        car.speed = 100;
        car.tireCount = 4;

        int i = 3;
        increase(i); // pass by value
        System.out.println("i "+ i);
        i = increaseReturn(i); // pass by value
        System.out.println("i "+ i);

        System.out.println(car.toString());
        speedUp(car); // pass by reference
        System.out.println(car.toString());
        tireUpdate(car); // pass by reference
        System.out.println(car.toString());
    }

    static void speedUp(Car car){
        car.speed = 200;
    }
    static void tireUpdate(Car car){
        car.tireCount = 5;
    }

    static void increase(int i){
        i++;
    }
    static int increaseReturn(int i){
        return ++i;
    }
}
class Car{
    String year;
    int speed;
    Integer tireCount;



    @Override
    public String toString() {
        return "Car{" +
                "year='" + year + '\'' +
                ", speed=" + speed +
                ", tireCount=" + tireCount +
                '}';
    }
}