package static2.ex;

public class Car {
    private static int numberOfCars;
    private String name;

    public Car(String name) {
        this.name = name;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public static int showTotalCars(){
        return numberOfCars;
    }
}
