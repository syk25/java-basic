package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        System.out.println("차량 구입, 이름: " + car1.getName());
        Car car2 = new Car("G80");
        System.out.println("차량 구입, 이름: " + car2.getName());
        Car car3 = new Car("Model Y");
        System.out.println("차량 구입, 이름: " + car3.getName());

        int numberOfCars = Car.showTotalCars();
        System.out.println("구매한 차량의 수: " + numberOfCars);

    }
}
